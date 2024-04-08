//lab 6.1.3
public class ShapeApp {
    public static void demo(Shape shape) {
        System.out.println("--- Shape demo for " + shape.getClass().getName() + " ---");
        System.out.println();
        System.out.println(shape);
        System.out.println("perimeter: " + shape.perimeter());
        System.out.println("area: " + shape.area());
        System.out.println("isQuadrilateral: " + shape.isQuadrilateral());
        System.out.println("isEquilateral: " + shape.isEquilateral());
        System.out.println();
    }
}
