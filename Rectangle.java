/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author Ваня
 */
class Rectangle extends Shape{
    private Point topLeft;
    private Point bottomRight;
    public Rectangle(String name, Point topLeft, Point bottomRight){
        super(name);
        this.topLeft=topLeft;
        this.bottomRight=bottomRight;
    }
    @Override
    public double getPerimetr() {
        double length=Math.abs(bottomRight.getX()-topLeft.getX());
        double width=Math.abs(bottomRight.getY()-topLeft.getY());
        return 2*(length+width);
    }

    @Override
    public double getArea() {
        double length=Math.abs(bottomRight.getX()-topLeft.getX());
        double width=Math.abs(bottomRight.getY()-topLeft.getY());
        return length*width;
    }
}
