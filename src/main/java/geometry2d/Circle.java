package geometry2d;

import exceptions.InvalidDimensionException;

public class Circle implements Figure {
    private final double radius;

    public Circle(double radius) {
        if (radius <= 0) {
            throw new InvalidDimensionException("Радиус должен быть положительным");
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return 3.14 * radius * radius;
    }

    @Override
    public String toString() {
        return "Круг с радиусом: " + area();
    }
}