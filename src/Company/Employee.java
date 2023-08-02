package Company;

public class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        }
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public void work() {
        System.out.println("Employee " + name + " starts to working");
    }
}
