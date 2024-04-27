package edu.iu.daeaker.model;

public class Flower {

    private int id;
    private String type;
    private String occasion;
    private String color;
    private int price;

    public Flower(){}

    public Flower(int id, String type, String occasion, String color, int price) {
        this.id = id;
        this.type = type;
        this.occasion = occasion;
        this.color = color;
        this.price = price;
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
}
