/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism.exercise01;

/**
 *
 * @author maumneto
 */
public class ImovelNovo extends Imovel {
    private double adicional;

    public ImovelNovo(double adicional, double preco) {
        super(preco);
        this.adicional = adicional;
    }
    
    public double getAdicional() {
        return (adicional/100)*getPreco();
    }
    
    public double calculoImovelNovo() {
        return getPreco() + getAdicional();
    }   
}
