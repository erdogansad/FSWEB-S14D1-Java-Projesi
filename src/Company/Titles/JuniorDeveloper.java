package Company.Titles;

import Company.Employee;

public class JuniorDeveloper extends Employee {
    public JuniorDeveloper(int id, String name, int salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        setSalary(1000);
        System.out.println("Junior Developer " + getName() + " starts to working");
    }

    public void work(double salary) {
        setSalary(salary);
        System.out.println("Junior Developer " + getName() + " starts to working with salary: " + getSalary());
    }

}
