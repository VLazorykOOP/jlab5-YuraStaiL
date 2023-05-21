public class Person implements Comparable<Person>{
    private final String country;
    private final String name;
    private final String education;
    private final int age;
    private final int height;

    public Person()
    {
        this("ukraine", "noname", "none", 18, 180);
    }

    public Person(String country, String name, String education, int age, int height) {
        this.country = country;
        this.name = name;
        this.education = education;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return this.name;
    }

    public String show() {
        return "\nname = " + getName() +
                ",\ncountry = " + getCountry() +
                ",\neducation = " + getEducation() +
                ",\nage = " + getAge() +
                ",\nheight = " + getHeight();
    }

    public String getCountry() {
        return country;
    }

    public String getEducation() {
        return education;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(getAge(), other.getAge());
    }
}
