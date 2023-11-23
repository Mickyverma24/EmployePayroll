import java.util.*;

class PayRollSystem {
    private List<Employee> employeList;

    public PayRollSystem() {
        employeList = new ArrayList<>();
    }

    public void addEmployee(Employee emp) {
        employeList.add(emp);
    }
}
