/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclass.exercise02;

/**
 *
 * @author maumneto
 */
public class TesteEmpresa {
    public static void main(String[] args) {
        Funcionario gerenteDeProjeto = new Gerente(8000);
        gerenteDeProjeto.aumentarSalario();
        
        Funcionario desenvolvedorWeb = new Desenvolvedor(10000);
        desenvolvedorWeb.aumentarSalario();
    }
}
