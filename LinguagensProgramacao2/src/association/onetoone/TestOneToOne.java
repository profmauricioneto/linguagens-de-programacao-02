/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package association.onetoone;

/**
 *
 * @author maumneto
 */
public class TestOneToOne {
    public static void main(String[] args) {
        Professor mauricio = new Professor("Maurício Neto", 1234);
        Course lip2 = new Course("Programação Orientada a Objetos", 01, mauricio);
        
        System.out.println("Course Name: " + lip2.getNameCourse());
        System.out.println("Professor of this course: " + lip2.getProfessorName());
    }
}
