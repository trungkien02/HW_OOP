package Bai2;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Employee> Employees = new ArrayList<Employee>();
        Employees.add(new Employee("Adam", 1, 3.47, 100000.0));
        Employees.add(new Employee("Eva", 2, 2.53, 100000.0));
        Employees.add(new Employee("Zeus", 3, 4.24, 100000.0));
        Employees.add(new Employee("Cradino", 4, 1.92, 100000.0));
        Employees.add(new Employee("Logitech", 5, 4.98, 100000.0));

        for (int i = 0; i < Employees.size(); i++) {
            
            System.out.println("\n- EmployeeID: "+ Employees.get(i).getEmployeeID());
            System.out.print("Name: "+ Employees.get(i).getName());
            System.out.print("\nSalary: "+ Employees.get(i).SalaryOfMonth());
            System.out.println("\n--------------------------------------------");
        }

    }
}
