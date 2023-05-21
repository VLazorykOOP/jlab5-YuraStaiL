import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Employee extends Person implements Comparable<Person>{
    private final String country;
    private final String name;
    private final String education;
    private final int age;
    private final int height;
    private final double salary;
    private final Date hiredate;

    private static final DecimalFormat df = new DecimalFormat("0.00");

    public Employee() {
        this("ukraine", "noname", 18, 180, 1000.345, new GregorianCalendar().getTime());
    }

    public Employee(String country, String name, int age, int height, double salary, Date hiredate) {
        this.country = country;
        this.name = name;
        this.education = "higher education";
        this.age = age;
        this.height = height;
        this.salary = salary;
        this.hiredate = hiredate;
    }

    @Override
    public int compareTo(Person other) {
        return super.compareTo(other);
    }

    @Override
    public String show() {
        df.setRoundingMode(RoundingMode.DOWN);
        return super.show() +
                ",\nsalary = " + df.format(salary) +
                ",\nhiredate = " + hiredate;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String getCountry() {
        return country;
    }

    @Override
    public String getEducation() {
        return education;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public int getHeight() {
        return height;
    }

    public double getSalary() {
        return salary;
    }

    public Date getHiredate() {
        return hiredate;
    }
}
