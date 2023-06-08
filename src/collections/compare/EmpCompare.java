package collections.compare;

import java.util.Comparator;

public class EmpCompare implements Comparator<Employee> {
    @Override
    public int compare(Employee em1, Employee em2) {
        return em1.getName().compareTo(em2.getName());
    }
}
