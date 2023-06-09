package collections.equals_hashcode;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee("Duvan", 21);
        Employee employee2 = new Employee("Duvan", 21);
        Employee employee1 = new Employee("Camilo", 32);

        if (employee2.equals(employee1)) {
            System.out.println("The objects have the same reference in memory");
        } else {
            System.out.println("The objects don't have the same reference in memory");
        }

        if (employee.hashCode() == employee2.hashCode()) {
            System.out.println("Hashes are equal");
        } else {
            System.out.println("Hashes are NOT equal");
        }

        System.out.println(employee1.hashCode());
    }
}
