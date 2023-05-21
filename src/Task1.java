import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Task1 {

    public static void printEmployee(ArrayList<Employee> employees) {
        for ( Employee employee:
                employees) {
            System.out.println(employee.show());
        }
    }

    public static void printEnginner(ArrayList<Engineer> engineers) {
        for ( Engineer engineer:
                engineers) {
            System.out.println(engineer.show());
        }
    }

    private static void printWorker(ArrayList<Worker> workers) {
        for ( Worker worker:
                workers) {
            System.out.println(worker.show());
        }
    }

    private static void printPerson(ArrayList<Person> persons) {
        for ( Person person:
                persons) {
            System.out.println(person.show());
        }
    }

    private static boolean inputEmployee(ArrayList<Employee> employees) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.nextLine();

        System.out.println("Enter country: ");
        String country = scanner.nextLine();

        System.out.println("Enter age: ");
        int age = scanner.nextInt();

        System.out.println("Enter height: ");
        int height = scanner.nextInt();

        System.out.println("Enter salary: ");
        double salary = scanner.nextDouble();

        return employees.add(
                new Employee(
                        country,
                        name,
                        age,
                        height,
                        salary,
                        new GregorianCalendar().getTime()
                        )
        );
    }

    private static boolean inputEngineer(ArrayList<Engineer> engineers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.nextLine();

        System.out.println("Enter country: ");
        String country = scanner.nextLine();

        System.out.println("Enter age: ");
        int age = scanner.nextInt();

        System.out.println("Enter height: ");
        int height = scanner.nextInt();

        System.out.println("Enter salary: ");
        double salary = scanner.nextDouble();

        return engineers.add(
                new Engineer(
                        country,
                        name,
                        age,
                        height,
                        salary,
                        new GregorianCalendar().getTime()
                )
        );
    }

    private static boolean inputWorker(ArrayList<Worker> workers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.nextLine();

        System.out.println("Enter country: ");
        String country = scanner.nextLine();

        System.out.println("Enter age: ");
        int age = scanner.nextInt();

        System.out.println("Enter height: ");
        int height = scanner.nextInt();

        System.out.println("Enter salary: ");
        double salary = scanner.nextDouble();

        return workers.add(
                new Worker(
                        country,
                        name,
                        age,
                        height,
                        salary,
                        new GregorianCalendar().getTime()
                )
        );
    }

    public static void writeDataToFile(ArrayList<Person> people, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Person person : people) {
                writer.write(person.show());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void task1() {
        String rootPath = System.getProperty("user.dir");

        String employeePath = rootPath + "\\data_txt\\employee.txt";
        String engineerPath = rootPath + "\\data_txt\\engineer.txt";
        String workerPath = rootPath + "\\data_txt\\worker.txt";
        String saveDataPath = rootPath + "\\data_txt\\collection.txt";

        ArrayList<Employee> employees = new ArrayList<>();
        ArrayList<Engineer> engineers = new ArrayList<>();
        ArrayList<Worker> workers = new ArrayList<>();

        try {
            FileBufferedReader.readPerson(employees, employeePath);
            FileBufferedReader.readPerson(engineers, engineerPath);
            FileBufferedReader.readPerson(workers, workerPath);

            System.out.println("Employees from file: ");
            printEmployee(employees);
            System.out.println("-----------------------------------");

            System.out.println("Engineers from file: ");
            printEnginner(engineers);
            System.out.println("-----------------------------------");

            System.out.println("Workers from file: ");
            printWorker(workers);
            System.out.println("-----------------------------------");

            Collections.sort(employees);
            Collections.sort(engineers);
            Collections.sort(workers);

            System.out.println("Employees after sort: ");
            printEmployee(employees);
            System.out.println("-----------------------------------");

            System.out.println("Engineers after sort: ");
            printEnginner(engineers);
            System.out.println("-----------------------------------");

            System.out.println("Workers after sort: ");
            printWorker(workers);
            System.out.println("-----------------------------------");

            System.out.println("Input employee");
            inputEmployee(employees);
            System.out.println("Input engineer");
            inputEngineer(engineers);
            System.out.println("Input worker");
            inputWorker(workers);

            Collections.sort(employees);
            Collections.sort(engineers);
            Collections.sort(workers);

            System.out.println("Employees [added new and sort]: ");
            printEmployee(employees);
            System.out.println("-----------------------------------");

            System.out.println("Engineers [added new and sort]: ");
            printEnginner(engineers);
            System.out.println("-----------------------------------");

            System.out.println("Workers [added new and sort]: ");
            printWorker(workers);
            System.out.println("-----------------------------------");

            ArrayList<Person> allPersons = new ArrayList<>();
            allPersons.addAll(employees);
            allPersons.addAll(engineers);
            allPersons.addAll(workers);

            System.out.println("All objects from collections: ");
            System.out.println("-----------------------------------");
            Collections.sort(allPersons);
            printPerson(allPersons);

            writeDataToFile(allPersons, saveDataPath);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}