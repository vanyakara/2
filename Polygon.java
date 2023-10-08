/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany;

/**
 *
 * @author Ваня
 */
public class Polygon extends Shape{
    private Point[] vertices;
    public Polygon(String name, Point[]vertices){
        super(name);
        this.vertices=vertices;
    }
    @Override
    public double getPerimetr() {
        double perimeter=0;
        for(int i=0;i<vertices.length;i++){
            double x1=vertices[i].getX();
            double y1=vertices[i].getY();
            double x2=vertices[i+1].getX();
            double y2=vertices[i+1].getY();
            perimeter +=Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1,2));
        }
        perimeter+=Math.sqrt(Math.pow(vertices[vertices.length-1].getX()-vertices[0].getX(), 2)+Math.pow(vertices[vertices.length-1].getY()-vertices[0].getY(), 2));
        return perimeter;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
