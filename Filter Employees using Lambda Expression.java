
import java.util.List;

record Employee(int id, String name, double salary) {}

public class EmployeeFilterLambda {

    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee(1, "Krishna", 55000),
                new Employee(2, "Aman", 30000),
                new Employee(3, "Rahul", 70000),
                new Employee(4, "Zoya", 45000)
        );

        System.out.println("Employees with Salary > 50000:");

        employees.stream()
                .filter(emp -> emp.salary() > 50000)
                .forEach(emp ->
                        System.out.println(
                                emp.id() + " " +
                                emp.name() + " " +
                                emp.salary()
                        )
                );
    }
}
