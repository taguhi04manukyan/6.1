package com.company;

public class Circle {
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void calculatePerimeter() {
        int perimeter = (int) (2 * this.radius * Math.PI);
        System.out.println("perimeter:" + perimeter);
    }

    public void calculateArea() {
        int area = (int) (this.radius * this.radius * Math.PI);
        System.out.println("area:" + area);
    }
}

