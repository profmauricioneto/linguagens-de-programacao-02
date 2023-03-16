/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package association.prova;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maumneto
 */
public class Disciplina {
    public String nomeDisciplina;
    public String codigoDisciplina;
    public int cargaHoraria;
    public List<Turma> turmas;
    
    public Disciplina(String nomeDisciplina, String codigoDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.codigoDisciplina = codigoDisciplina;
        this.cargaHoraria = 0;
        turmas = new ArrayList<>();
    }
    
    public String getCodigo() {
        return this.codigoDisciplina;
    }
    
    public String getNomeDisciplina() {
        return this.nomeDisciplina;
    }
    
    public void adicionarTurma(Turma t) {
        turmas.add(t);
    }
}
