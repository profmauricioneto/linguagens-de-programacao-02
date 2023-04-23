/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance.exercises.exercise05;

/**
 *
 * @author newaccount
 */
public class TesteQuestao05 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("fulano@email.com", 01);
        Funcionario vendedor = new Funcionario(4000, 02);
        Venda boneco = new Venda(001, cliente, vendedor);
        
        cliente.addVendaCliente(boneco);
        vendedor.addVendaFuncionario(boneco);
        
    }
}
