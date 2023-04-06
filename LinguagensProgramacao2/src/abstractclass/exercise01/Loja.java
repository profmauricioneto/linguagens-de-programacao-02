/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclass.exercise01;

/**
 *
 * @author maumneto
 */
public class Loja {
    public static void main(String[] args) {
        Product woody = new Toy("Woody", 100);
        Product buzzlightyear = new Toy("Buzzlightyear", 200);
        Product kikoSquareBall = new Ball("Bola Quadrada do Kiko", 50);
        
        woody.showInformation();
        buzzlightyear.showInformation();
        kikoSquareBall.showInformation();
        
        woody.update("Woody ToyStory Gold Edition", 400);
        buzzlightyear.update("BuzzLightyear Collection Edition", 800);
        kikoSquareBall.update("Gift from Teacher Girafales", 300);
        
        woody.showInformation();
        buzzlightyear.showInformation();
        kikoSquareBall.showInformation(); 
    }
 
}
