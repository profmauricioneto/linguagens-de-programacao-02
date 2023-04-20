/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclass.exercise02;

/**
 *
 * @author maumneto
 */
public class Gerente extends Funcionario {

    public Gerente(double salario) {
        super(salario);
    }

    @Override
    public void aumentarSalario() {
        salario += salario*0.1;
        System.out.println(salario);
    }
    
    
}
