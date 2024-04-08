//lab 6.4


public class Square extends Rectangle {
private int side;

    public Square(int side) {
        super(side, side);
        this.side = side;
    }
    public boolean isEquilateral() {
        return true;
    }

    public String toString() {
        return String.format("a square inherited from a rectangle with a width of %d and a height of %d", side, side);
    }
}