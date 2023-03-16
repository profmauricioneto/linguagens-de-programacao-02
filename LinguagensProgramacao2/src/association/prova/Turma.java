/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package association.prova;

/**
 *
 * @author maumneto
 */
public class Turma {
    public String idTurma;
    public int semestre;
    public Disciplina disciplina;
    
    public Turma(String idTurma, int semestre, Disciplina disciplina) {
        this.idTurma = idTurma;
        this.semestre = semestre;
        this.disciplina = disciplina;
    }
    
    public String getIdTurma() {
        return idTurma;
    }
    
    public int getSemestre() {
        return semestre;
    }
}
