 class Rectangle {

    double height;
    double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return height * width;
    }

    public double getPerimeter() {
        return 2 * (height + width);
    }
}

class Square extends Rectangle{

    double length;

    public Square(double length){
        super(length, length);
        this.length = length;
    }

}

class Test{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        System.out.println("Area of rectangle: " + rectangle.getArea());
        System.out.println("Perimeter of rectangle: " + rectangle.getPerimeter());

        Square square = new Square(10);
        System.out.println("Area of square: " + square.getArea());
        System.out.println("Perimeter of square: " + square.getPerimeter());
    }
}