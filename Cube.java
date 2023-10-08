/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author Ваня
 */
class Cube extends Shape{
    private double l;
    public Cube(String name, double l){
        super(name);
        this.l=l;
    }
    @Override
    public double getPerimetr() {
        return 0;
    }
    @Override
    public double getArea() {
        return 6*Math.pow(l, 2);
    }
    
}
