/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package association.onetomany;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author maumneto
 */
public class Professor {
    public List<Course> courses;
    public String professorName;
    public int professorId;
    
    public Professor(String professorName, int professorId) {
        this.professorName = professorName;
        this.professorId = professorId;
        this.courses = new ArrayList<>();
    }
    
    public int getIdProfessor() {
        return professorId;
    }
    public String getNameProfessor() {
        return professorName;
    }
    public void addCourse(Course course) {
        this.courses.add(course);
    }
    public void showAllCourseName() {
        for(Course courseName: courses) {
            System.out.println(courseName.getNameCourse());
        }
    }
}

