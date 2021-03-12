package hometask_1;

public class Square extends Shape{
    private final int width;
    private final int height;

    public Square(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int calcSquare() {
        return this.height * this.width;
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", height=" + height +
                "} " + super.toString();
    }
}
