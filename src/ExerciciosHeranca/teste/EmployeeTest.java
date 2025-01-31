package ExerciciosHeranca.teste;

import ExerciciosHeranca.dominio.Employee;
import ExerciciosHeranca.dominio.OutsoucerdEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeTest {
    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        List<Employee> employeeList = new ArrayList<>();
        Employee employee;
        System.out.print("Enter the number of employee: ");
        int n = tc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i + 1) + " data: ");
            System.out.print("Outsourced(y/n): ");
            char res = tc.next().charAt(0);
            tc.nextLine();
            System.out.print("Name: ");
            String name = tc.nextLine();
            System.out.print("Hours: ");
            int hours = tc.nextInt();
            System.out.print("Value per hours: ");
            double value = tc.nextDouble();
            if (res == 'y') {
                System.out.print("Additional charge: ");
                double additional = tc.nextDouble();
                employee = new OutsoucerdEmployee(name, hours, value, additional);
                employeeList.add(employee);
            } else {
                employee = new Employee(name, hours, value);
                employeeList.add(employee);

            }
        }

        for (Employee employee1 : employeeList) {
            System.out.println(employee1.getName() + " - " + employee1.payment());
        }
    }
}
