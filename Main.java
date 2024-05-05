// Main.java
import java.util.ArrayList;
import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("John", 50000, 1, "2022-01-01", "Junior Worker");
        Worker worker2 = new Worker("Alice", 45000, 2, "2022-02-15", "Senior Worker");
        Worker worker3 = new Worker("Bob", 40000, 3, "2022-03-10", "Junior Worker");
        Worker worker4 = new Worker("Eva", 42000, 4, "2022-04-20", "Senior Worker");

        Manager manager = new Manager("Mike", 75000, 5, "2021-12-01", "Project Manager");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        employees.add(manager);

        for (Employee emp : employees) {
            System.out.println("- " + emp.getName() + " (ID: " + emp.hashCode() + ", Position: " + emp.getPosition() + ", Hire date: " + emp.getHireDate() + ", Salary: " + emp.getSalary() + ")");
            emp.work();
        }
    }
}
