/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclass.exercise01;

/**
 *
 * @author maumneto
 */
public class Ball extends Product {
    public Ball(String name, double price){
        super(name, price);
    }
    
    @Override
    public void update(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void showInformation() {
        System.out.println("Name: " + name + "\n" + "Price: " + price);
    }
}
