import java.text.DecimalFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Worker extends Person implements Comparable<Person>{
    private final String country;
    private final String name;
    private final String education;
    private final int age;
    private final int height;
    private final double salary;
    private final Date hiredate;
    private static final DecimalFormat df = new DecimalFormat("0.00");

    public Worker() {
        this("ukraine", "noname", 18, 180, 1000.345, new GregorianCalendar().getTime());
    }

    public Worker(String country, String name, int age, int height, double salary, Date hiredate) {
        this.country = country;
        this.name = name;
        this.education = "secondary special education";
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
    public String getCountry() {
        return country;
    }

    @Override
    public String getName() {
        return name;
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

    @Override
    public String show() {
//        return "\nname = " +
//                this.getName() + ",\ncountry = " +
//                country + ",\neducation = " +
//                education + ",\nage = " +
//                age + "\nheight = " + height +
//                "\nsalary = " + df.format(salary) +
//                "\nhiredate = " + hiredate;
        return super.show();
    }
}
