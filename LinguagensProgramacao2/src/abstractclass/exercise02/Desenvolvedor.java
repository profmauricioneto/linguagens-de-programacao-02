/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclass.exercise02;

/**
 *
 * @author maumneto
 */
public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(double salario) {
        super(salario);
    }

    @Override
    public void aumentarSalario() {
        salario += salario*0.2;
        System.out.println(salario);

    }
    
    
    
}
