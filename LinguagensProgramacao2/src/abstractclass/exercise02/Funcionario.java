
package abstractclass.exercise02;

/**
 *
 * @author maumneto
 */
public abstract class Funcionario {
    protected String nome;
    protected double salario;
    
    public Funcionario(double salario){
        this.salario = salario;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public abstract void aumentarSalario();
    
}
