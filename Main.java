import company.models.Manager;
import company.models.Worker;

public class Main {

    public static void main(String[] args) {
        Worker worker1 = new Worker("Jan Kowalski", 2500, 1);
        Worker worker2 = new Worker("Anna Nowak", 3000, 2);
        Worker worker3 = new Worker("Piotr Zieliński", 2200, 3);
        Worker worker4 = new Worker("Marta Wiśniewska", 2800, 4);

        Manager manager = new Manager("Krzysztof Baran", 5000, 5);

        System.out.println("Pracownik: " + worker1.getName() + ", pensja: " + worker1.getSalary());
        worker1.work();

        System.out.println("Pracownik: " + worker2.getName() + ", pensja: " + worker2.getSalary());
        worker2.work();

        System.out.println("Pracownik: " + worker3.getName() + ", pensja: " + worker3.getSalary());
        worker3.work();

        System.out.println("Pracownik: " + worker4.getName() + ", pensja: " + worker4.getSalary());
        worker4.work();

        System.out.println("\nMenedżer: " + manager.getName() + ", pensja: " + manager.getSalary());
        manager.work();
    }
}
