import task1.Person;
import task2.Square;
import task3.ComparisonFourArguments;
import task4.Builder;
import task4.Human;
import task4.Pilot;
import task4.Sailor;
import task5.InternationalPassport;
import task5.Passport;

public class Main {
    public static void main(String[] args) {

//       task1();
//       task2();
//       task3();
//       task4();
         task5();

    }

    public static void task1() {
        //Task1

        Person person1 = new Person("name1", "01.01.2000", "123-12-12", "Kaliningrad", "Russia", "Mira 5-5");
        System.out.println(person1);
        System.out.println("Counter = " + Person.counter());
        Person person2 = new Person("name2", "01.01.2000", "123-12-12", "Kaliningrad", "Russia", "Mira 5-5");
        System.out.println(person2);
        System.out.println("Counter = " + Person.counter());
        Person person3 = new Person("name3", "01.01.2000", "123-12-12", "Kaliningrad", "Russia", "Mira 5-5");
        System.out.println(person3);
        System.out.println("Counter = " + Person.counter());
        Person person4 = new Person("name4", "01.01.2000", "123-12-12", "Kaliningrad", "Russia", "Mira 5-5");
        System.out.println(person4);
        System.out.println("Counter = " + Person.counter());
        Person person5 = new Person("name5", "01.01.2000", "123-12-12", "Kaliningrad", "Russia", "Mira 5-5");
        System.out.println(person5);
        System.out.println("Counter = " + Person.counter());
    }

    public static void task2() {
        //Task2
        //Площадь треугольника если известна сторона и высота
        System.out.println("Площадь треугольника если известна сторона и высота: " + Square.triangleSquareBySideAndHeight(5, 3));

        //Площадь треугольника если известны две стороны и синус угла
        System.out.println("Площадь треугольника если известны две стороны и синус угла: " + Square.triangleSquareByTwoSidesAndSinus(3, 4, 0.5));

        //Площадь треугольника если есть радиус описанной окружности
        System.out.println("Площадь треугольника если есть радиус описанной окружности: " + Square.triangleSquareByThreeSidesAndCircumscribedRadius(4, 4, 4, 3));

        //Площадь прямоугольника
        System.out.println("Площадь прямоугольника: " + Square.rectangleSquare(3, 6));

        //Площадь квадрата
        System.out.println("Площадь квадрата: " + Square.square(6));

        //Площадь ромба
        System.out.println("Площадь ромба: " + Square.rhombusSquareByTwoDiagonals(5, 7));

    }

    public static void task3() {
        System.out.println("Max = " + ComparisonFourArguments.max(new int[]{1, 2, 3, 4}));
        System.out.println("Min = " + ComparisonFourArguments.min(new int[]{1, 2, 3, 4}));
        System.out.println("Average = " + ComparisonFourArguments.average(new int[]{1, 2, 3, 4}));
        System.out.println("Factorial = " + ComparisonFourArguments.factorial(4));
    }

    public static void task4() {
        Human human1 = new Builder("Tom1", "Ford1", 21);
        Human human2 = new Sailor("Tom2", "Ford2", 22);
        Human human3 = new Pilot("Tom3", "Ford3", 23);
        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
    }

    public static void task5() {
        Passport passport1 = new InternationalPassport("27 12 234564",
                "Name1",
                "Surname1",
                "01.01.2000",
                "73 000000",
                new String[]{"DE1234567", "DE7654321", "PL1234567"});
        Passport passport2 = new InternationalPassport("27 12 234564",
                "Name2",
                "Surname2",
                "01.01.2010",
                "73 111111",
                new String[]{"DE1234567", "DE7654321", "PL1234567"});

        System.out.println(passport1);
        System.out.println(passport2);
    }
}



