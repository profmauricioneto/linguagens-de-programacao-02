/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.mvc;

/**
 *
 * @author maumneto
 */
public class ModelViewControllerTest {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        new Controller(model, view);
    }
}
