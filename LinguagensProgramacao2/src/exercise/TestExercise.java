/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise;

/**
 *
 * @author maumneto
 */
public class TestExercise {
    public static void main(String[] args) {
        University unichristus = new University("Unichristus");
        
        Course si = new Course("Sistemas de Informação", 001);
        Course direito = new Course("Direito", 002);
        
        Student mauricio = new Student("Mauricio");
        Student fulano = new Student("Fulano");
        Student cicrano = new Student("Cicrano");
        Student beltrano = new Student("Beltrano");
        
        si.addStudent(mauricio);
        si.addStudent(fulano);
        
        direito.addStudent(cicrano);
        direito.addStudent(beltrano);
        
        unichristus.addCourse(si);
        unichristus.addCourse(direito);
        
        System.out.println("Universidade " + unichristus.getNameUniversity());
        
        System.out.println("Quantidade de cursos: " + unichristus.getTotalCourses());
        
        System.out.println("Cursos Atuais: ");
        unichristus.getNameCourses();
        
        System.out.println("Total de alunos: " + unichristus.getTotalStudents());
        
        unichristus.getAllStudents();
    }
}
