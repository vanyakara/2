/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author Ваня
 */
interface Shapeint{
    String getName();
    void setName(String Name);
    double getPerimetr();
    double getArea();
    void showInfo();
    String getInfo();
}
abstract class Shape implements Shapeint{
    protected String name;
    protected double perimetr;
    protected double area;
    public Shape(String Name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public abstract double getPerimetr();
    public abstract double getArea();
    public void showInfo(){
        System.out.println("Figure: "+name);
        System.out.println("Perimetr: "+getPerimetr());
        System.out.println("Plosht: "+getArea());
    }
    public String getInfo(){
        return "Figure: "+name+"/nPerimetr: "+getPerimetr()+"/nPlosht: "+getArea();
    }
}
