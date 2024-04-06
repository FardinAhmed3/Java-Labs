//Lab 6.1.2

public class Rectangle implements Shape {
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


    public static void main(String[] args) {
        RectangleApp rectangle = new RectangleApp(3, 4);
        
        System.out.println("A rectangle with a width of " + myRectangle.width + " and a height of " + myRectangle.length);
        System.out.println("perimeter: " + myRectangle.perimeter());
        System.out.println("area: " + myRectangle.area());
        System.out.println("isQuadrilateral: " + myRectangle.isQuadrilateral());
        System.out.println("isEquilateral: " + myRectangle.isEquilateral());
    }
}