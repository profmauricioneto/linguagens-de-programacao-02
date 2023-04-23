package inheritance.exercises.exercise04;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private int id;
    public String descricao;
    public List<Pessoa> pessoas = new ArrayList<>();

    public Departamento(int id) {
        this.id = id;
    }

    protected int getId() {
        return id;
    }

    public void addPessoa(Pessoa pessoa) {
        this.pessoas.add(pessoa);
    }
}
