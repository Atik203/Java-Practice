class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Rectangle {
    Point p1, p2, p3, p4;

    public Rectangle(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    public double diagonalLength() {
        double l = Math.sqrt(((p1.x - p2.x) * (p1.x - p2.x)) + ((p1.y - p2.y) * (p1.y - p2.y)));
        double w = Math.sqrt(((p1.x - p4.x) * (p1.x - p4.x)) + ((p1.y - p4.y) * (p1.y - p4.y)));
        return Math.sqrt(l * l + w * w);
    }

    public double perimeter() {
        double l = Math.sqrt(((p1.x - p2.x) * (p1.x - p2.x)) + ((p1.y - p2.y) * (p1.y - p2.y)));
        double w = Math.sqrt(((p1.x - p4.x) * (p1.x - p4.x)) + ((p1.y - p4.y) * (p1.y - p4.y)));
        return 2 * (l + w);
    }

    public boolean pointInsideRectangle(Point p) {
        return p.x >= p1.x && p.x <= p3.x && p.y >= p1.y && p.y <= p3.y;
    }

    public boolean rectangleInsideRectangle(Rectangle r) {
        return r.p1.x >= p1.x && r.p1.y >=p1.y && r.p3.x <= p3.x && r.p3.y <= p3.y;
    }

    public boolean circleInsideRectangle(Circle c){
        return c.center.x - c.radius >= p1.x && c.center.x + c.radius <= p3.x && c.center.y - c.radius >= p1.y && c.center.y + c.radius <= p3.y;
    }
}

class Circle{
    Point center;
    double radius;
    Circle(Point center, double radius){
        this.center = center;
        this.radius = radius;
    }

    public boolean circleInsideCircle(Circle c){
        return Math.sqrt((this.center.x - c.center.x) * (this.center.x - c.center.x) + (this.center.y - c.center.y) * (this.center.y - c.center.y)) + this.radius <= c.radius;
    }
    public boolean PointInsideCircle(Point p){
        double a = this.center.x;
        double b = this.center.y;
        double c = p.x;
        double d = p.y;
        double distance = Math.sqrt(((a - c) * (a - c)) + ((b - d) * (b - d)));
        return distance < this.radius;

    }

}



class Test{
    public static void main(String[] args) {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(1, 3);
        Point p3 = new Point(3, 3);
        Point p4 = new Point(3, 1);
        Rectangle r1 = new Rectangle(p1, p2, p3, p4);
        System.out.println(r1.diagonalLength());
        System.out.println(r1.perimeter());
        Point p5 = new Point(3, 2);
        System.out.println(r1.pointInsideRectangle(p5));
        Point p6 = new Point(2, 2);
        Point p7 = new Point(2, 3);
        Point p8 = new Point(3, 6);
        Point p9 = new Point(3, 2);
        Rectangle r2 = new Rectangle(p6, p7, p8, p9);
        System.out.println(r1.rectangleInsideRectangle(r2));
        Point p10 = new Point(3, 3);
        Circle c1 = new Circle(p10, 1);
        System.out.println(r1.circleInsideRectangle(c1));
        Point p11 = new Point(3, 3);
        Circle c2 = new Circle(p11, 2);
        System.out.println(c1.circleInsideCircle(c2));
        Point p12 = new Point(3, 3);
        System.out.println(c1.PointInsideCircle(p12));


    }
}