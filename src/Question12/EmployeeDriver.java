/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Tejaswi Reddy Nallavolu
 */
public class EmployeeDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Answer to Question12: Tejaswi Reddy Nallavolu");
        // TODO code application logic here
        ArrayList<Employee> eList = new ArrayList<>();
        Employee e1 = new Employee(809652, "Tejaswi Reddy Nallavolu", 1050000);
        Employee e2 = new Employee(653487, "Mridu Singh", 557000);
        Employee e3 = new Employee(812876, "Anchal Agarwal", 230000);
        Employee e4 = new Employee(302569, "Amanul Haque", 950000);
        Employee e5 = new Employee(873568, "Keerthi Sheelam", 180000);
        eList.add(e1);
        eList.add(e2);
        eList.add(e3);
        eList.add(e4);
        eList.add(e5);
        System.out.println("Employees of cognizant: " + "\n" + "Before sorting:");
        print(eList);
        Collections.sort(eList);
        System.out.println("Sorting by Employee Id: ");
        print(eList);

        System.out.println("Sorting by Employee name: ");
        Collections.sort(eList, new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                return e1.getEmpName().compareTo(e2.getEmpName());
            }
        });
        print(eList);
        System.out.println("Sorting by Employee salary: ");
        Collections.sort(eList, new Comparator<Employee>() {
            public int compare(Employee emp1, Employee emp2) {
                return Double.compare(emp1.getEmpSalary(), emp2.getEmpSalary());
            }

        });
        print(eList);
    }

    public static void print(List<Employee> l) {
        l.forEach(employee -> {
            System.out.println(employee);
        });

    }
}
