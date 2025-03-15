 class Point {
    int x,y;
    Point(int x,int y){
        this.x = x;
        this.y =  y;
    }
}

 class Circle{
     Point center;
     double radius;
     Circle(Point center,double radius) {
         this.center = center;
         this.radius = radius;
     }
 }

class Rectangle{
    Point p1,p2,p3,p4;
    Rectangle(Point p1,Point p2,Point p3,Point p4){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    public double diagonal(){
        double h = Math.sqrt(Math.pow((p1.x-p4.x),2) + Math.pow((p1.y-p4.y),2));
        double w = Math.sqrt(Math.pow((p1.x-p2.x),2) + Math.pow((p1.y-p2.y),2));
        double d = Math.sqrt(h*h + w*w);
        return d;

    }

    public double perimeter(){
        double h = Math.sqrt(Math.pow((p1.x-p4.x),2) + Math.pow((p1.y-p4.y),2));
        double w = Math.sqrt(Math.pow((p1.x-p2.x),2) + Math.pow((p1.y-p2.y),2));
        return 2*(h+w);
    }

    public int pointInsideRectangle(Point p){
        if(p.x>=this.p1.x && p.x <= this.p3.x && p.y >= this.p1.y && p.y <= this.p3.y){
            return 1;
        }
        return 0;

    }
    public void RectangleInsideRectangle(Rectangle r){
        if(r.p1.x >= this.p1.x && r.p1.y >= this.p1.y && r.p3.y <= this.p3.y && r.p3.x <= this.p3.x){
            System.out.println("Rectangle is inside");
        }
        else{
            System.out.println("Rectangle is not inside");
        }
    }

    public void CircleInsideRectangle(Circle c){
        if(c.center.x - c.radius >= this.p1.x && c.center.x + c.radius <= this.p3.x && c.center.y - c.radius >= this.p1.y && c.center.y + c.radius <= this.p3.y){
            System.out.println("Circle is inside");
        }
        else{
            System.out.println("Circle is not inside");
        }
    }

}



class Test{
    public static void main(String[] args) {
        Point p1 = new Point(1,1);
        Point p2 = new Point(1,3);
        Point p3 = new Point(3,3);
        Point p4 = new Point(3,1);
        Rectangle r = new Rectangle(p1,p2,p3,p4);
        System.out.println(r.diagonal());
        System.out.println(r.perimeter());
        Point p = new Point(2,2);
        System.out.println(r.pointInsideRectangle(p));
        Point p5 = new Point(2, 2);
        Point p6 = new Point(2, 3);
        Point p7 = new Point(3, 3);
        Point p8 = new Point(3, 2);
        Rectangle r1 = new Rectangle(p5,p6,p7,p8);
        r.RectangleInsideRectangle(r1);
        Point p9 = new Point(2,2);
        Circle c = new Circle(p9,2);
        r.CircleInsideRectangle(c);

    }
}