package hometask_1;

public class Triangle extends Shape{
    private final int base;
    private final int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public int calcSquare() {
        return (this.base * this.height) / 2;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                "} " + super.toString();
    }
}
