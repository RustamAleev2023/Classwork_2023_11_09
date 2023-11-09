import task1.Person;
import task2.Square;

public class Main {
    public static void main(String[] args) {

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


        //Task2
        //Площадь треугольника если известна сторона и высота
        System.out.println("Площадь треугольника если известна сторона и высота: " + Square.triangleSquareBySideAndHeight(5, 3));

        //Площадь треугольника если известны две стороны и синус угла
        System.out.println("Площадь треугольника если известны две стороны и синус угла: " + Square.triangleSquareByTwoSidesAndSinus(3, 4, 0.5));

        //Площадь треугольника если есть радиус описанной окружности
        System.out.println("Площадь треугольника если есть радиус описанной окружности: " + Square.triangleSquareByThreeSidesAndCircumscribedRadius(4, 4, 4, 3));

        //Площадь прямоугольника
        System.out.println("Площадь прямоугольника: " + Square.rectangleSquare(3,6));

        //Площадь квадрата
        System.out.println("Площадь квадрата: " + Square.square(6));

        //Площадь ромба
        System.out.println("Площадь ромба: " + Square.rhombusSquareByTwoDiagonals(5,7));



    }
}



