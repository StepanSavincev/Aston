package Lesson_8;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestApi {

    public void get() {
        RestAssured.given().baseUri("https://postman-echo.com")
                .queryParam("foo1","bar1")
                .queryParam("foo2","bar2")
                .when()
                .get("/get")
                .then()
                .statusCode(200)
                .body("args.foo1", Matchers.equalTo("bar1"))
                .body("args.foo2", Matchers.equalTo("bar2"))
                .log()
                .all();
    }

    public void postText() {
        String bodiText = "helllo";
        Response response = RestAssured.given()
                .baseUri("https://postman-echo.com")
                .header("Content-Type","text/plain")
                .body(bodiText)
                .when().post("/post")
                .then()
                .statusCode(200)
                .extract()
                .response();
        System.out.println(response.asPrettyString());
    }

    public void postData() {
        RestAssured.baseURI = "https://postman-echo.com";
        RestAssured.given()
                .contentType(ContentType.JSON)
                .body("{ \"message\": \"helllo\" }")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("json.message", Matchers.equalTo("helllo"))
                .log().body();
    }

    public void delete() {
        RestAssured.baseURI = "https://postman-echo.com";
        String requestBody = "This is expected to be sent back as part of response body.";
        Response response = RestAssured.given()
                .header("Content-Type","text/plain")
                .body(requestBody)
                .when()
                .delete("/delete")
                .then()
                .statusCode(200)
                .extract().response();
        System.out.println(response.asPrettyString());
    }

    public void put() {
        RestAssured.baseURI = "https://postman-echo.com/put";
        String requestBody = "This is expected to be sent back as part of response body.";
        Response response = RestAssured.given()
                .header("Content-Type","text/plain")
                .header("Accept","hello")
                .header("x-forwarded-proto","https")
                .header("user-agent","PostmanRuntime/7.50.0")
                .header("postman-token", "890a090c-2331-447a-845a-4ad1be91686a")
                .header("cookie", "__cf_bm=2z1ATydvwuIF744vC.7rxU1.0L4rvdFeEmSo0LDHv2o-1763039050-1.0.1.1-pCBxAQuRKdfvJwNBxNuIs8y3cjolgGGSOcVbNZFbIR14O87Tbwq.lQuUK4Wz3cpq6xWokqNseyI3bMwB_ZXfzz0AuNZOrKoxWAe7M4WdKd4; _cfuvid=wTPRLO_XoV.8M88HBi8q6x0hsLzadIpb2MRW.puJ.WQ-1763039050366-0.0.1.1-604800000; sails.sid=s%3AVBVJDP27ML_5f3b8UWnO1K1UMI4Ue5Wi.SSfmGArE9%2FGOB3wMAeV9bz8E2ccqSk6yQChWNCqx0qQ")
                .body(requestBody)
                .put();
        response.then().log().all();
        response.then().statusCode(200);
        MatcherAssert.assertThat(response.getBody().asString(), Matchers.containsString(requestBody));
    }

    public void patch(){
        RestAssured.baseURI = "https://postman-echo.com";
        String requestBody = "{ \"message\": \"hello\" }";
        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .patch("/patch")
                .then()
                .statusCode(200)
                .extract().response();
        System.out.println("Response body");
        System.out.println(response.asPrettyString());
    }
}
