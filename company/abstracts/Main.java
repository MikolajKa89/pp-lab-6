// Main.java
import company.models.Manager;
import company.models.Worker;
import company.abstracts.Employee;

public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker("John", 50000, 1, "2022-01-01", "Junior Worker");
        Worker worker2 = new Worker("Alice", 45000, 2, "2022-02-15", "Senior Worker");
        Worker worker3 = new Worker("Bob", 40000, 1, "2022-03-10", "Junior Worker"); // worker3 shares the same id as worker1
        Worker worker4 = new Worker("Eva", 42000, 4, "2022-04-20", "Senior Worker");

        Manager manager = new Manager("Mike", 75000, 5, "2021-12-01", "Project Manager");

        System.out.println(worker1.getName() + " has code: " + worker1.hashCode());
        System.out.println(worker2.getName() + " has code: " + worker2.hashCode());
        System.out.println(worker3.getName() + " has code: " + worker3.hashCode());
        System.out.println(worker4.getName() + " has code: " + worker4.hashCode());
        System.out.println(manager.getName() + " has code: " + manager.hashCode());

        // Checking equality for worker3 with other instances
        for (Employee emp : new Employee[]{worker1, worker2, worker3, worker4, manager}) {
            if (worker3.equals(emp)) {
                System.out.println(worker3.getName() + " equals " + emp.getName());
            }
        }
    }
}
