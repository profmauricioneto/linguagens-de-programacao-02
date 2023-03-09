/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package association.onetomany;

/**
 *
 * @author maumneto
 */
public class TestOneForMany {
    public static void main(String[] args) {
        Professor mauricio = new Professor("Mauricio Neto", 1234);
        Course poo = new Course("Programação Orientada a Objetos", 01, mauricio);
        Course lip1 = new Course("Linguagens de Programação I", 02, mauricio);
        Course lm1 = new Course("Lógica Matemática I", 03, mauricio);
        
        mauricio.addCourse(poo);
        mauricio.addCourse(lip1);
        mauricio.addCourse(lm1);
        
        mauricio.showAllCourseName();
    }
}
