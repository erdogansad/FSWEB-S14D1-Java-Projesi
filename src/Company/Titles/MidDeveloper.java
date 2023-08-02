package Company.Titles;

import Company.Employee;

public class MidDeveloper extends Employee {
    public MidDeveloper(int id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(2000);
        System.out.println("Mid Developer " + getName() + " starts to working");
    }

    public void work(double salary) {
        setSalary(salary);
        System.out.println("Mid Developer " + getName() + " starts to working with salary: " + getSalary());
    }
}
