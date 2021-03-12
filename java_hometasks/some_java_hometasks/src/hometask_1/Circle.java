package hometask_1;

public class Circle extends Shape{
    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public int calcSquare() {
        return (int)(Math.PI * this.radius * this.radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "} " + super.toString();
    }
}
