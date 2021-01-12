import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Igor", "Marketing", 300);
        Employee emp2 = new Employee("Kris", "IT", 3000);
        Employee emp3 = new Employee("Mariya", "Sales", 800);
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);

        EmployeeService employeeService = new EmployeeService();

        employeeService.selectEmployee(employeeList, employee -> employee.getName().startsWith("K"));
        employeeService.selectEmployee(employeeList, employee -> employee.getSalary()< 400);
        employeeService.selectEmployee(employeeList, employee -> employee.getDepartment().equals("Sales"));
    }

}
