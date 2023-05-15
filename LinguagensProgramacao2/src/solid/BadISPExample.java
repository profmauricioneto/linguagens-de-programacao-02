/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid;

/**
 *
 * @author maumneto
 */
interface DrawShape {
    public void triangleDraw();
    public void squareDraw();
    public void circleDraw();
}

class Triangle implements DrawShape {
    @Override
    public void triangleDraw() {
        System.out.println("Drawing a triangle");
    }
    @Override
    public void squareDraw() {
        System.out.println("Drawing a square");
    }
    @Override
    public void circleDraw() {
        System.out.println("Drawing a circle");
    }

    void drawTriangle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

class Square implements DrawShape {
    @Override
    public void triangleDraw() {
        System.out.println("Drawing a triangle");
    }
    @Override
    public void squareDraw() {
        System.out.println("Drawing a square");
    }
    @Override
    public void circleDraw() {
        System.out.println("Drawing a circle");
    }
}

class Circle implements DrawShape {
    @Override
    public void triangleDraw() {
        System.out.println("Drawing a triangle");
    }
    @Override
    public void squareDraw() {
        System.out.println("Drawing a square");
    }
    @Override
    public void circleDraw() {
        System.out.println("Drawing a circle");
    }
}

public class BadISPExample {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Square square = new Square();
        Circle circle = new Circle();
        
        triangle.triangleDraw();
        circle.circleDraw();
        square.squareDraw();
    }
}
