/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise;

/**
 *
 * @author maumneto
 */
public class Student {
    public String name_student;
    public String enrollment;
    public Course course;
    
    public Student(String name_student) {
        this.name_student = name_student;
    }
    
    public void setCourse(Course course) {
        this.course = course;
    }
    
    public String getNameStudent() {
        return name_student;
    }    
}
