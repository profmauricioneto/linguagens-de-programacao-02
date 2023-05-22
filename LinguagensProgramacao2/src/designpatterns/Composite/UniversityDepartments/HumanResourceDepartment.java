/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.Composite.UniversityDepartments;

/**
 *
 * @author maumneto
 */
public class HumanResourceDepartment implements Department {
    public int id;
    public String name;

    public HumanResourceDepartment(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }    
}
