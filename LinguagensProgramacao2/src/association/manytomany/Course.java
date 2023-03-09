/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package association.manytomany;


import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author maumneto
 */
public class Course {
    public List<Professor> professors;
    public String courseName;
    public int courseId;
    
    public Course(String courseName, int courseId) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.professors = new ArrayList<>();
    }
    
    public String getCourseName() {
        return courseName;
    }
    public int getCourseId() {
        return courseId;
    }
    public void addProfessor(Professor professor) {
        this.professors.add(professor);
    }
    public void showProfessors() {
        for(Professor p: professors) {
            System.out.println(p.getProfessorName());
        }
    }
}
