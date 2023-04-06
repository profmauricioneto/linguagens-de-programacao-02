/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism.exercise01;

/**
 *
 * @author maumneto
 */
public class ImovelVelho extends Imovel {
    private double desconto;

    public ImovelVelho(double desconto, double preco) {
        super(preco);
        this.desconto = desconto;
    }
    
    public double getDesconto() {
        return desconto;
    }
    
    public double calculoImovelVelho() {
        return getPreco() - (desconto*100)*getPreco();
    }
    
    
}
