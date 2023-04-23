package inheritance.exercises.exercise04;

public class Pessoa {
    private int id;
    protected String nome;
    public Departamento departamento;

    Pessoa(int id, Departamento departamento) {
        this.id = id;
        this.departamento = departamento;
    }

    protected int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}