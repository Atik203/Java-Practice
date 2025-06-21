public class Point {

    private static int instanceCount = 0;
    private static final int MAX_INSTANCES = 2;

    public int x;
    public int y;

    private Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Point createInstance(int x, int y) {
        if (instanceCount < MAX_INSTANCES) {
            instanceCount++;
            return new Point(x, y);
        } else {
            throw new IllegalStateException("Cannot create more than " + MAX_INSTANCES + " instances of Point");
        }
    }

    public static void main(String[] args) {
        Point p1 = Point.createInstance(1, 2); // valid
        Point p2 = Point.createInstance(3, 4); // valid
//         Point p3 = Point.createInstance(5, 6); // throws IllegalStateException
    }
}