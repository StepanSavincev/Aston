package Lesson_8;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class Tests {

    private static TestApi testApi;

    @BeforeAll
    public static void before() {
       testApi = new TestApi();
    }
    @org.junit.jupiter.api.Test
    public void apiGetTest() {
        testApi.get();
    }
    @org.junit.jupiter.api.Test
    public void apiPostTextTest() {
        testApi.postText();
    }

    @org.junit.jupiter.api.Test
    public void apiPostDataTest() {
        testApi.postData();
    }

    @org.junit.jupiter.api.Test
    public void apiDeleteTest() {
        testApi.delete();
    }

    @org.junit.jupiter.api.Test
    public void apiPutTest() {
        testApi.put();
    }

    @org.junit.jupiter.api.Test
    public void apiPatchTest() {
        testApi.patch();
    }
}
