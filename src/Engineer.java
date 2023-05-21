import java.util.Date;
import java.util.GregorianCalendar;


public class Engineer extends Employee implements Comparable<Person>{
    public Engineer() {
        super("ukraine", "noname", 18, 180, 2000.345, new GregorianCalendar().getTime());
    }

    public Engineer(String country, String name, int age, int height, double salary, Date hiredate) {
        super(country, name, age, height, salary, hiredate);
    }

    @Override
    public int compareTo(Person other) {
        return super.compareTo(other);
    }

    @Override
    public String show() {
        return super.show();
    }
}
