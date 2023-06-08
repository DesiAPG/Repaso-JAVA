package collections.comparable;

public class Employee implements Comparable<Employee> {
    private String name;
    private String surname;
    private String country;
    private int age;
    private double salary;

    public Employee(String name, String surname, String country, int age, double salary) {
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.age = age;
        this.salary = salary;
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee employee) {
        return this.age - employee.getAge();
    }
}
