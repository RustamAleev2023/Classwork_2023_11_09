package task4;

public class Sailor extends Human{
    public Sailor(String name, String surname, int age) {
        super(name, surname, age);
    }

    @Override
    public String toString() {
        return "Sailor:" + "name: " + name + ", surname: " + surname + ", age: " + age;
    }
}
