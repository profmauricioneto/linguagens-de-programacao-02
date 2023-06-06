/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.Composite.UniversityDepartments;

import inheritance.exercises.exercise04.Departamento;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author maumneto
 */
public class SalesDepartment implements Department {
    public int id;
    public String description;
    public List<Department> salesDepartaments; 

    public SalesDepartment(int id, String description) {
        this.id = id;
        this.description = description;
        this.salesDepartaments = new ArrayList<>();
    }
    
    public void addSalesDepartment(Department d) {
        salesDepartaments.add(d);
    }
    
    public void removeSalesDepartment(Department d) {
        salesDepartaments.remove(d);
    }
    
    @Override
    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
        salesDepartaments.forEach(Department::printDepartmentName);
    }
}
