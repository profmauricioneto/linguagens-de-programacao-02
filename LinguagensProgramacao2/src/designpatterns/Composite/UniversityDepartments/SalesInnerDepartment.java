/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.Composite.UniversityDepartments;

/**
 *
 * @author maumneto
 */
public class SalesInnerDepartment extends SalesDepartment {

    public SalesInnerDepartment() {
        super(0, null);
    }

    @Override
    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }
    
    
}
