package Company.Titles;

import Company.Employee;

public class SeniorDeveloper extends Employee {
    public SeniorDeveloper(int id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(3000);
        System.out.println("Senior Developer " + getName() + " starts to working");
    }

    public void work(double salary) {
        setSalary(salary);
        System.out.println("Senior Developer " + getName() + " starts to working with salary: " + getSalary());
    }
}
