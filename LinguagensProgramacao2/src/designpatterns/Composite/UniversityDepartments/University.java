/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns.Composite.UniversityDepartments;

/**
 *
 * @author maumneto
 */
public class University {
    public static void main(String[] args) {
        SalesDepartment sales = new SalesDepartment(1, "Equipe de Vendas!");
        FinancialDepartment financial = new FinancialDepartment(2, "Equipe Financeira");
        HumanResourceDepartment rh = new HumanResourceDepartment(4, "Equipe RH");
        
        HeadDepartment allDepartment = new HeadDepartment(3, "Chefia");
        
        ResearchDepartment researchDep = new ResearchDepartment(5, "Research Department");
        
        allDepartment.addDepartment(sales);
        allDepartment.printDepartmentName();
        System.out.println("-------------------------------");
        allDepartment.addDepartment(financial);
        allDepartment.printDepartmentName();
        System.out.println("-------------------------------");
        allDepartment.addDepartment(rh);
        allDepartment.printDepartmentName();
        System.out.println("-------------------------------");
        allDepartment.addDepartment(researchDep);
        allDepartment.printDepartmentName();
    }
}
