package org.example;

public class MainPark {
    public static void main(String[] args) {
        Park park = new Park("Парк развлечений");
        Park.Attraction attraction1 = park.new Attraction("Колесо обозрения", "10:00 - 22:00", 500);
        Park.Attraction attraction2 = park.new Attraction("Американские горки", "11:00 - 20:00", 700);

        attraction1.printAttractionInfo();
        attraction2.printAttractionInfo();
    }
}
