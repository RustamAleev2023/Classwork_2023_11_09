package task2;

public class Square {

    //Площадь треугольника если известна сторона и высота.
    public static double triangleSquareBySideAndHeight(int side, int height){
        return 0.5 * side * height;
    }

    //Площадь треугольника если известны две стороны и синус угла
    public static double triangleSquareByTwoSidesAndSinus(int side1, int side2, double sinus){
        return 0.5 * side1 * side2 * sinus;
    }

    //Площадь треугольника если есть радиус описанной окружности
    public static double triangleSquareByThreeSidesAndCircumscribedRadius(int side1, int side2, int side3, int radius){
        return (double) (side1 * side2 * side3) / (4 * radius);
    }

    //Площадь прямоугольника
    public static int rectangleSquare(int side1, int side2){
        return side1 * side1;
    }

    //Площадь квадрата
    public static int square(int side){
        return side * side;
    }

    //Площадь ромба
    public static double rhombusSquareByTwoDiagonals(int d1, int d2){
        return 0.5 * (d1 * d2);
    }

}
