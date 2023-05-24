/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.singleton.firstexample;

/**
 *
 * @author maumneto
 */
public class TestSingleton {
    public static void main(String[] args) {
        SingletonExample s1 = SingletonExample.getInstance();
        SingletonExample s2 = SingletonExample.getInstance();
        if (s1 == s2) {
            System.out.println("Same instances");
        } else {
            System.out.println("Different instances");
        }
    }
}
