package com.example.myapplication;

public class Gift {
    private String name;
    private String description;
    private boolean gender;
    private int price;
    private String photo;

    public Gift() {
    }

    public Gift(String name, String description, boolean gender, int price, String photo) {
        this.name = name;
        this.description = description;
        this.gender = gender;
        this.price = price;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "Gift{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", gender=" + gender +
                ", price=" + price +
                ", photo='" + photo + '\'' +
                '}';
    }
}
