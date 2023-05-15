/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid;

/**
 *
 * @author mauricio.moreira
 */
class GeometricFormat {
    public double length;
    public double height;
    public GeometricFormat() {
        this.length = 0;
        this.height = 0;
    }
    public GeometricFormat(double length, double height) {
        this.height = height;
        this.length = length;
    }
    public double areaSquare() {
        return length*height;
    }
    public double areaTriangle() {
        double area = (length * height)/2;
        return area;
    }
    public void drawSquare() {
        System.out.println("Drawing a square!");
    }
    public void drawTriangle() {
        System.out.println("Drawing a triangle!");
    }    
}

public class BadSRPExample {
    public static void main(String[] args) {
        // example with square
        GeometricFormat square = new GeometricFormat(5, 7);
        System.out.format("Area Square: %f\n", square.areaSquare());
        square.drawSquare();
        // example with triangle
        GeometricFormat triangle = new GeometricFormat(5, 7);
        System.out.format("Area Tiangle: %f\n", square.areaTriangle());
        triangle.drawTriangle();
    }
}
