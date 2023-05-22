/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.Composite.UniversityDepartments;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author maumneto
 */
public class HeadDepartment implements Department {
    public int id;
    public String description;
    public List<Department> departments;
    public HeadDepartment(int id, String description) {
        this.id = id;
        this.description = description;
        departments = new ArrayList<>();
    }
    public void addDepartment(Department d) {
        departments.add(d);
    }
    public void removeDepartment(Department d) {
        departments.remove(d);
    }
    @Override
    public void printDepartmentName() {
        /*
            for(Department d: departaments) {
                d.printDepartmentName();
            }
        */
        departments.forEach(Department::printDepartmentName);
    }    
}
