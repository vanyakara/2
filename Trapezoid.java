/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author Ваня
 */
class Trapezoid extends Shape{
    public double h;
    public double a;
    public double b;
    public Trapezoid(String name, double a, double b, double h){
        super(name);
        this.a=a;
        this.b=b;
        this.h=h;
    }
    @Override
    public double getPerimetr() {
        return 0;
    }
    @Override
    public double getArea() {
        return (h*(a+b))/2;
    }
}
