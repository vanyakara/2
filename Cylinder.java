/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author Ваня
 */
class Cylinder extends Shape{
    private double r;
    private double h;
    public Cylinder(String name, double r, double h){
        super(name);
        this.r=r;
        this.h=h;
    }
    @Override
    public double getArea() {
        return 2*Math.PI*r*(r+h);
    }

    @Override
    public double getPerimetr() {
        return (2*r+h)*2;
    }
    
}
