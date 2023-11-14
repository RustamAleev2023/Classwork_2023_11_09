package task7;

public class Trapezoid extends Figure{
    int a;
    int b;
    int h;

    public Trapezoid(int a, int b, int h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public double square() {
        System.out.println("Площадь трапеции = " + ((a + b) * h) / 2);
        return (double) ((a + b) * h) / 2;
    }
}
