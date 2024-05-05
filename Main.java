
import company.abstracts.Employee;
import company.models.Manager;
import company.models.Worker;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static Employee worker1;
    private static Employee worker2;
    private static Employee worker4;
    private static Employee worker3;

    public static void main(String[] args) {
        // ... (Utworzenie instancji obiektów)

        // Dodanie instancji do listy
        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(worker4);
        Employee manager;
        employees.add(manager);

        // Zliczanie sum pensji
        double totalSalary = 0;
        double totalManagerSalary = 0;
        double totalWorkerSalary = 0;

        for (Employee employee : employees) {
            totalSalary += employee.getSalary();
            if (employee instanceof Manager) {
                totalManagerSalary += employee.getSalary();
            } else if (employee instanceof Worker) {
                totalWorkerSalary += employee.getSalary();
            }
        }

        // Wyświetlanie sum pensji
        System.out.println("\nCałkowita suma pensji wszystkich pracowników: " + totalSalary);
        System.out.println("Całkowita suma pensji wszystkich managerów: " + totalManagerSalary);
        System.out.println("Całkowita suma pensji wszystkich pracowników fizycznych: " + totalWorkerSalary);

        // Wyszukiwanie obiektów z powtarzającym się ID
        System.out.println("\nWyszukiwanie obiektów z powtarzającym się ID:");

        for (Employee employee : employees) {
            for (Employee employeeToCompare : employees) {
                if (employee.getId() == employeeToCompare.getId() && !employee.equals(employeeToCompare)) {
                    System.out.println("Znaleziono powtarzające się ID: " + employee.getId());
                    System.out.println("Obiekt 1: " + employee);
                    System.out.println("Obiekt 2: " + employeeToCompare);
                    System.out.println();
                }
            }
        }

        // Dodanie kolejnych instancji z powtarzającym się ID
        Worker worker5 = new Worker("Grzegorz Wiśniewski", 3500, 1, "2022-08-01", "Software Developer", null); // Powtarza ID z worker1
        Manager manager2 = new Manager("Anna Kowalska", 6000, 5, "2021-01-01", "CEO"); // Powtarza ID z manager

        employees.add(worker5);
        employees.add(manager2);

        // Ponowne wyszukiwanie obiektów z powtarzającym się ID
        System.out.println("\nPonowne wyszukiwanie obiektów z powtarzającym się ID:");

        for (Employee employee : employees) {
            for (Employee employeeToCompare : employees) {
                if (employee.getId() == employeeToCompare.getId() && !employee.equals(employeeToCompare)) {
                    System.out.println("Znaleziono powtarzające się ID: " + employee.getId());
                    System.out.println("Obiekt 1: " + employee);
                    System.out.println("Obiekt 2: " + employeeToCompare);
                    System.out.println();
                }
            }
        }
    }
}
