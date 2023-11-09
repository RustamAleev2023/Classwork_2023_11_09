package task4;

public class Pilot extends Human{
    public Pilot(String name, String surname, int age) {
        super(name, surname, age);
    }

    @Override
    public String toString() {
        return "Pilot:" + "name: " + name + ", surname: " + surname + ", age: " + age;
    }
}
