package Company;

import java.util.*;

public class Company {
    private ArrayList<Employee> employees = new ArrayList<Employee>();

    public void hire(Employee employee){
        this.employees.add(employee);
    }

    public void hireAll(Collection<Employee> employee){
        this.employees.addAll(employee);
    }

    public void fire(Employee employee){
        employees.remove(employee);
    }

    public static int getIncome(){
        return 20000000;
    }

    public int countEmployee(){
        return employees.size();
    }

    public List<Employee> getEmployees() {
        return employees;
    }

}
