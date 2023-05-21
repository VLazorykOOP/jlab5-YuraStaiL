import java.io.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class FileBufferedReader {
    public static void readPerson(ArrayList person, String filePath)
            throws IOException {
        String rootPath = System.getProperty("user.dir");
        String employeePath = rootPath + "\\data_txt\\employee.txt";
        String engineerPath = rootPath + "\\data_txt\\engineer.txt";
        String workerPath = rootPath + "\\data_txt\\worker.txt";


        // open a file for reading
        String line;
        ArrayList<String> lines = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));

        int i = 0;
        while ((line = reader.readLine()) != null) {
            if (line.trim().isEmpty()) {
                continue; // skip empty lines
            }
            i++;
            lines.add(line);;

            if (employeePath.equals(filePath) && i == 5) {
                addEmployee(person, lines);

                i = 0;
                lines.clear();
            }

            if (workerPath.equals(filePath) && i == 5) {
                addWorker(person, lines);

                i = 0;
                lines.clear();
            }

            if (engineerPath.equals(filePath) && i == 5) {
                addEngineer(person, lines);

                i = 0;
                lines.clear();
            }

        }

        System.out.println(person.size());
        reader.close(); // close a file
    }

    private static void addEmployee(ArrayList<Person> employees, ArrayList<String> lines) {
        employees.add(new Employee(
                lines.get(0),
                lines.get(1),
                Integer.parseInt(lines.get(2)),
                Integer.parseInt(lines.get(3)),
                Double.parseDouble(lines.get(4)),
                new GregorianCalendar(2020, Calendar.JANUARY, 28).getTime()
        ));
    }

    private static void addWorker(ArrayList<Person> employees, ArrayList<String> lines) {
        employees.add(new Worker(
                lines.get(0),
                lines.get(1),
                Integer.parseInt(lines.get(2)),
                Integer.parseInt(lines.get(3)),
                Double.parseDouble(lines.get(4)),
                new GregorianCalendar(2019, Calendar.JANUARY, 28).getTime()
        ));
    }

    private static void addEngineer(ArrayList<Person> employees, ArrayList<String> lines) {
        employees.add(new Engineer(
                lines.get(0),
                lines.get(1),
                Integer.parseInt(lines.get(2)),
                Integer.parseInt(lines.get(3)),
                Double.parseDouble(lines.get(4)),
                new GregorianCalendar(2021, Calendar.JANUARY, 28).getTime()
        ));
    }
}