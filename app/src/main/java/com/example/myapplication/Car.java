package com.example.myapplication;

public class Car {
    private String brand;
    private String model;
    private int year;
    private double price;
    private String photo;

    public Car() {
    }


    public Car(String brand, String model, int year, double price, String photo) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.photo = photo;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
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
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", photo='" + photo + '\'' +
                '}';
    }
}
