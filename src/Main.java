import entity.Person;

public class Main {
    public static void main(String[] args) {

    //Task1

        Person person1 = new Person("name1", "01.01.2000", "123-12-12", "Kaliningrad", "Russia", "Mira 5-5");
        System.out.println(person1);
        System.out.println("Counter = " + Person.counter());
        Person person2= new Person("name2", "01.01.2000", "123-12-12", "Kaliningrad", "Russia", "Mira 5-5");
        System.out.println(person2);
        System.out.println("Counter = " + Person.counter());
        Person person3 = new Person("name3", "01.01.2000", "123-12-12", "Kaliningrad", "Russia", "Mira 5-5");
        System.out.println(person2);
        System.out.println("Counter = " + Person.counter());
        Person person4 = new Person("name4", "01.01.2000", "123-12-12", "Kaliningrad", "Russia", "Mira 5-5");
        System.out.println(person4);
        System.out.println("Counter = " + Person.counter());
        Person person5 = new Person("name5", "01.01.2000", "123-12-12", "Kaliningrad", "Russia", "Mira 5-5");
        System.out.println(person5);
        System.out.println("Counter = " + Person.counter());


    }
}