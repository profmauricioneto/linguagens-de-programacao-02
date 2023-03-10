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
public class University {
    public String name_university;
    public String description;
    List<Course> courses;
    
    public University(String name_university) {
        this.name_university = name_university;
        courses = new ArrayList<>();
    }
    
    public void addCourse(Course course) {
        this.courses.add(course);
    }
    
    public String getNameUniversity() {
        return name_university;
    }
    
    public void getNameCourses() {
        for (Course c: courses) {
            System.out.println(c.getNameCourse());
        }
    }
    
    public int getTotalCourses() {
//        int total = 0;
//        for(Course c: courses) {
//            total++;
//        }
        return courses.size();
    }
    
    public int getTotalStudents() {
        int numberOfStudents = 0;
        for(Course c: courses) {
            numberOfStudents += c.students.size();
        }
        return numberOfStudents;
    }    
}
