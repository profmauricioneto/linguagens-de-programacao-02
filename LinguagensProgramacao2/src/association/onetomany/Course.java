/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package association.onetomany;

/**
 *
 * @author maumneto
 */
public class Course {
    public Professor professor;
    public int courseId;
    public String courseName;
    
    public Course(String courseName, int courseId, Professor professor) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.professor = professor;
    }
    
    public String getNameCourse() {
        return this.courseName;
    }
    
    public int getIdCourse() {
        return courseId;
    }

}