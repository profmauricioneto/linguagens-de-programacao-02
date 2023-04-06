/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism.exercise01;

/**
 *
 * @author maumneto
 */
public class ImovelNovoCorretor extends ImovelNovo {
    private double lucro;

    public ImovelNovoCorretor(double lucro, double adicional, double preco) {
        super(adicional, preco);
        this.lucro = lucro;
    }
    
    @Override
    public double calculoImovelNovo() {
        return getPreco() + getAdicional() + (lucro/100)*getPreco();
    }
    
}
