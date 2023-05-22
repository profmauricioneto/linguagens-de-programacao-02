/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.Composite.UniversityDepartments;

/**
 *
 * @author maumneto
 */
public class ResearchDepartment implements Department {
    private int id;
    public String description;

    public ResearchDepartment(int id, String description) {
        this.id = id;
        this.description = description;
    }

    @Override
    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }
}
