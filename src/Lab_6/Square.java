//lab 6.2.1

public class Square implements Shape {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int perimeter() {
        return 4 * side;
    }

    public int area() {
        return side * side;
    }

    public int numSides() {
        return 4;
    }

    public boolean isQuadrilateral() {
        return true;
    }

    public boolean isEquilateral() {
        return true;
    }

    public String toString() {
        return "an independently implemented square with a side of " + side;
    }
}
