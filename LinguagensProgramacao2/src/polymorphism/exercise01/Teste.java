/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package polymorphism.exercise01;

/**
 *
 * @author maumneto
 */
public class Teste {
    public static void main(String[] args) {
        ImovelNovo casaBeiraMar = new ImovelNovo(25, 700);
        System.out.println("Casa Beira Mar: " + casaBeiraMar.calculoImovelNovo());
        
        ImovelNovo casaBeiraMarCorretor = new ImovelNovoCorretor(10, 25, 700);
        System.out.println("Imovel Novo com Corretor: " + casaBeiraMarCorretor.calculoImovelNovo());
    }
}
