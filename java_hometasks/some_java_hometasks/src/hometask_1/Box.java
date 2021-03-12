package hometask_1;

import java.util.ArrayList;
import java.util.List;

public class Box {
    private final List<Shape> shapes = new ArrayList<Shape>();
    private final int avarageSpace;
    private int ocupatedSpace;

    public Box(int avarageSpace) {
        this.avarageSpace = avarageSpace;
    }

    public boolean add(Shape shape) {
        if (this.avarageSpace - this.ocupatedSpace > shape.calcSquare()){
            shapes.add(shape);
            this.ocupatedSpace += shape.calcSquare();
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Box{" +
                "shapes=" + shapes +
                ", avarageSpace=" + avarageSpace +
                ", ocupatedSpace=" + ocupatedSpace +
                '}';
    }
}
