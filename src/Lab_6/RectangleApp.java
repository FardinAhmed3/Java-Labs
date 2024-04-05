public class RectangleApp implements Shape {
    int length;
    int width;
    
	public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public int perimeter() {
        return 2 * (length + width);
    }

    @Override
    public int area() {
        return length * width;
    }

    @Override
    public int numSides() {
        return 4;
    }

    @Override
    public boolean isQuadrilateral() {
        return true;
    }

    @Override
    public boolean isEquilateral() {
        return length == width;
    }
}