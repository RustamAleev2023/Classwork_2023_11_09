package task7;

public class RightTriangle extends Figure{
    int a;
    int b;

    public RightTriangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double square() {
        System.out.println("Площадь прямоугольнного треугольника = " + (a * b) / 2);
        return (double) (a * b) / 2;
    }
}
