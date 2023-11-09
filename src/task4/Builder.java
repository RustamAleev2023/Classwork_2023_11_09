package task4;

public class Builder extends Human{
    public Builder(String name, String surname, int age) {
        super(name, surname, age);
    }

    @Override
    public String toString() {
        return "Builder:" + "name: " + name + ", surname: " + surname + ", age: " + age;
    }
}
