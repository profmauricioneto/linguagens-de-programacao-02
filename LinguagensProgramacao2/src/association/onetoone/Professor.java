/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package association.onetoone;

/**
 *
 * @author maumneto
 */
public class Professor {
    public Course course;
    public String professorName;
    public int professorId;
    
    public Professor(String professorName, int professorId) {
        this.professorName = professorName;
        this.professorId = professorId;
    }
}
