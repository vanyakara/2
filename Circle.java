/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author Ваня
 */
class Circle extends Shape{
    private double r;
    public Circle(String name, double r){
        super(name);
        this.r=r;
    }
    @Override
    public double getPerimetr() {
        return 2*Math.PI*r;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(r, 2);
    }
}
