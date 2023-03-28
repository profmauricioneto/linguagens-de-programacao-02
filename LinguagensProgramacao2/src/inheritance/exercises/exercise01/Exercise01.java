/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance.exercises.exercise01;

/**
 *
 * @author maumneto
 */
public class Exercise01 {
    public static void main(String[] args) {
        Superclass super_class = new Superclass();
        System.out.println(super_class.attribute1);
//        System.out.println(super_class.attribute2);
        System.out.println(super_class.attribute3);
        super_class.method1();
        
        Subclass sub_class = new Subclass();
        System.out.println(sub_class.attribute1);
//        System.out.println(sub_class.attribute2);
        System.out.println(sub_class.attribute3);
    }
}
