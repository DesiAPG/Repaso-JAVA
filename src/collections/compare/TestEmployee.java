package collections.compare;

import java.util.*;

public class TestEmployee {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Duvan", "Marin", "Colombia", 21, 4500000));
        employeeList.add(new Employee("Camilo", "Camacho", "Colombia", 12, 4500000));
        employeeList.add(new Employee("Juan", "Rene", "Colombia", 42, 4500000));
        employeeList.add(new Employee("Solis", "Urrego", "Colombia", 52, 4500000));
        Collections.sort(employeeList, new EmpCompare());

        for (Employee employee : employeeList) {
            System.out.println("Name: " + employee.getName());
            System.out.println("Surname: " + employee.getSurname());
            System.out.println("Country: " + employee.getCountry());
            System.out.println("Age: " + employee.getAge());
            System.out.println("Salary: " + employee.getSalary());
            System.out.println("");
        }
    }
}
