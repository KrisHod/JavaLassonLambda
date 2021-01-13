import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

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

    public ArrayList<Employee> createNewObjects (Supplier<Employee> supplier){
        ArrayList<Employee> emp = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            emp.add(supplier.get());
        }
        return emp;
    }

    public void changeObject (Employee employee, Consumer<Employee> consumer){
        consumer.accept(employee);
    }
}
