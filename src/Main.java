import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeService employeeService = new EmployeeService();

        Employee emp1 = new Employee("Igor", "Marketing", 300);
        Employee emp2 = new Employee("Kris", "IT", 3000);
        Employee emp3 = new Employee("Mariya", "Sales", 800);
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(emp1);
        employeeList.add(emp2);
        employeeList.add(emp3);

        //functionality of Predicate
        employeeService.selectEmployee(employeeList, employee -> employee.getName().startsWith("K"));
        employeeService.selectEmployee(employeeList, employee -> employee.getSalary() < 400);
        employeeService.selectEmployee(employeeList, employee -> employee.getDepartment().equals("Sales"));

        //functionality of Supplier
        ArrayList<Employee> employeesMarketing = employeeService.createNewObjects(() -> new Employee("Marketing"));
        System.out.println(employeesMarketing);

        //functionality of Consumer
        employeeService.changeObject(employeesMarketing.get(0), employee -> {
            employee.setName("Duane");
            employee.setSalary(4000);
        });
        System.out.println(employeesMarketing);
    }

}
