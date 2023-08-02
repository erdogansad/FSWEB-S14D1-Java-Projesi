import Company.HRManager;
import Company.Titles.JuniorDeveloper;
import Company.Titles.MidDeveloper;
import Company.Titles.SeniorDeveloper;
import Cylinder.Circle;
import Cylinder.Cylinder;
import Pool.Cuboid;
import Pool.Rectangle;

public class Main {

    private static void runApp() {
        System.out.println("---------- Cylinder ----------");
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());
        System.out.println("---------- Pool ----------");
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width= " + rectangle.getWidth());
        System.out.println("rectangle.length= " + rectangle.getLength());
        System.out.println("rectangle.area= " + rectangle.getArea());
        Cuboid cuboid = new Cuboid(5, 10, 5);
        System.out.println("cuboid.width= " + cuboid.getWidth());
        System.out.println("cuboid.length= " + cuboid.getLength());
        System.out.println("cuboid.area= " + cuboid.getArea());
        System.out.println("cuboid.height= " + cuboid.getHeight());
        System.out.println("cuboid.volume= " + cuboid.getVolume());
        System.out.println("---------- Employee ----------");

        HRManager manager = new HRManager(new String[0], new String[0], new String[0]);
        JuniorDeveloper employeeOne = new JuniorDeveloper(1, "John Doe", 1000);
        MidDeveloper employeeTwo = new MidDeveloper(2, "Jane Doe", 2000);
        SeniorDeveloper employeeThree = new SeniorDeveloper(3, "Jack Doe", 3000);

        manager.addEmployee(employeeOne);
        manager.addEmployee(employeeTwo);
        manager.addEmployee(employeeThree);

        System.out.println("Junior Developers: " + manager.getJDevs());
        System.out.println("Mid Developers: " + manager.getMDevs());
        System.out.println("Senior Developers: " + manager.getSDevs());
        employeeOne.work();
        employeeOne.work(1500);
        employeeTwo.work();
        employeeTwo.work(2500);
        employeeThree.work();
        employeeThree.work(3500);
        System.out.println("------------------------------");
    }

    public static void main(String[] args) {
        runApp();
    }
}