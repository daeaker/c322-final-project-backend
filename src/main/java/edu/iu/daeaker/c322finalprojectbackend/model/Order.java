package edu.iu.daeaker.c322finalprojectbackend.model;

public class Order {

    private int id;
    private int customerId;
    private String flowerName;
    private int cost;
    private String firstName;
    private String lastName;
    private String status;


    public Order() {}


    public Order(int id, int customerId, String flowerName, int cost, String firstName, String lastName, String status) {
        this.id = id;
        this.customerId = customerId;
        this.flowerName = flowerName;
        this.cost = cost;
        this.firstName = firstName;
        this.lastName = lastName;
        this.status = status;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
