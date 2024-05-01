package edu.iu.daeaker.c322finalprojectbackend.model;

public class Flower {

    private int id;
    private static String type;
    private static String occasion;
    private static String color;
    private static int price;
    private static String name;

    public Flower(){}

    public Flower(int id, String type, String occasion, String color, int price, String name) {
        this.id = id;
        this.type = type;
        this.occasion = occasion;
        this.color = color;
        this.price = price;
        this.name = name;
    }

    public static String toLine(int id) {
        return String.format("%1$s,%2$s,%3$s,%4$s,%5$s,%6$s", id, type, occasion, color, price, name);
    }

    public static Flower fromLine(String line) {
        String[] tokens = line.split(",");
        return new Flower(Integer.parseInt(tokens[0]), tokens[1], tokens[2], tokens[3], Integer.parseInt(tokens[4]), tokens[5]);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOccasion() {
        return occasion;
    }

    public void setOccasion(String occasion) {
        this.occasion = occasion;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() { return name; }

    public void setName(String name) { Flower.name = name; }
}
