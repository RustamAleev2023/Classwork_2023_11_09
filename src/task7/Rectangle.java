package task7;

public class Rectangle extends Figure{
    int a;
    int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double square() {
        System.out.println("Площадь прямоугольника = " + a * b);
        return a * b;
    }
}
