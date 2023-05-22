/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.mvc;

/**
 *
 * @author maumneto
 */
public class Model {
    double num1 = 0;
    double num2 = 0;
    double result = 0;
    public Model() {}
    
    public void setNumbers(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public void sum() {
        result = num1+num2; 
    }
    public void subtraction() {
        result = num1-num2;
    }
    public void multiply() {
        result = num1*num2;
    }
    public void divide() {
        if (num2==0){
            result = -1;
        } else {
            result = num1/num2;        
        }
    }
    public double getResult() {
        return result;
    }   
}
