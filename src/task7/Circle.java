package task7;

public class Circle extends Figure {
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double square() {
        System.out.println("Площадь круга = " + Math.PI * radius * radius);
        return Math.PI * radius * radius;
    }
}
