//lab 6.3

//Composite

public class Square implements Shape {
    private Rectangle rectangle;
private int side;

    public Square(int side) {
    this.side = side;
        this.rectangle = new Rectangle(side, side);
    }

    public int perimeter() {
        return rectangle.perimeter();
    }

    public int area() {
        return rectangle.area();
    }

    public int numSides() {
        return rectangle.numSides();
    }

    public boolean isQuadrilateral() {
        return rectangle.isQuadrilateral();
    }

    public boolean isEquilateral() {
        return true;
    }

    public String toString() {
        return String.format("a square composed of a rectangle with a width of %d and a height of %d", side, side);
    }
}