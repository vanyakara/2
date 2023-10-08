/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany;

/**
 *
 * @author Ваня
 */
public class App {
    public static void main(String[] args) {
        Point rectTopLeft=new Point(0,0);
        Point rectBottomRight=new Point(4,3);
        Rectangle rectangle=new Rectangle("Pravougulnik", rectTopLeft, rectBottomRight);
        Point[] polygonVertices={new Point(0, 0), new Point(4, 0), new Point(2, 3)};
        Polygon polygon=new Polygon("Poligon",polygonVertices);
        Circle circle=new Circle("Okrugnost",5);
        Cylinder cylinder=new Cylinder("Cilindur", 4,5);
        Trapezoid trapezoid=new Trapezoid("Trapets", 6, 7, 8);
        Cube cube=new Cube("Cube", 8);
        
        rectangle.showInfo();
        System.out.println();
        polygon.showInfo();
        System.out.println();
        circle.showInfo();
        System.out.println();
        cylinder.showInfo();
        System.out.println();
        trapezoid.showInfo();
        System.out.println();
        cube.showInfo();
    }
}
