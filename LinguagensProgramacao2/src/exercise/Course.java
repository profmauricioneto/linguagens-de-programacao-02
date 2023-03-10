/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercise;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maumneto
 */
public class Course {
    public String name_course;
    public int id_course;
    public List<Student> students;
    public University university;
    
    public Course(String name_course, int id_course) {
        this.name_course = name_course;
        this.id_course = id_course;
        students = new ArrayList<>();
    }
    
    public int getIdCourse() {
        return id_course;
    }
    
    public String getNameCourse() {
        return name_course;
    }
    
    public void addStudent(Student student) {
        this.students.add(student);
    }
    
    public void getCourseStudents(){
        for(Student s: students) {
            System.out.println(s.getNameStudent());
        }
    }    
}
