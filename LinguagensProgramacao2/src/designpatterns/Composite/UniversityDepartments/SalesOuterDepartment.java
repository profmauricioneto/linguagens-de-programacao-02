/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.Composite.UniversityDepartments;

/**
 *
 * @author maumneto
 */
public class SalesOuterDepartment extends SalesDepartment {

    public SalesOuterDepartment() {
        super(0, null);
    }
    
    @Override
    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }
    
}
