import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeeService {
    public void printEmployee (Employee employee){
        System.out.println("Employee's name is " + employee.getName() + ". His/Her department is " + employee.getDepartment() +
                ". His salary is " + employee.getSalary());
    }

    public void selectEmployee (ArrayList<Employee> employeeList, Predicate <Employee> predicate){
        for(Employee emp:employeeList){
            if (predicate.test(emp)){
                printEmployee(emp);
            }
        }
    }
}
