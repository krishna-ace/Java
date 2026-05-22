import java.util.*;
import java.util.stream.Collectors;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class EmployeeFilterLambda {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(1, "Krishna", 55000),
                new Employee(2, "Aman", 30000),
                new Employee(3, "Rahul", 70000),
                new Employee(4, "Zoya", 45000)
        );

        List<Employee> highSalaryEmployees = employees.stream()
                .filter(emp -> emp.salary > 50000)
                .collect(Collectors.toList());

        System.out.println("Employees with Salary > 50000:");

        highSalaryEmployees.forEach(emp ->
                System.out.println(
                        emp.id + " " +
                        emp.name + " " +
                        emp.salary
                )
        );
    }
}
