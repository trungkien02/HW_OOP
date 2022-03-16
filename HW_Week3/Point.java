package OOP.hw3.java;

public class Point {
    private double x;
    private double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }
    void setX(double x) {
        this.x = x;
    }
    void setY(double y) {
        this.y = y;
    }
    double getX() {
        return x;
    }
    double getY() {
        return y;
    }
}
class PointTest {
    public static boolean collinear(Point p1, Point p2, Point p3) {
        return p1.getX() * (p2.getY() - p3.getY()) + p2.getX() * (p3.getY() - p1.getY()) + p3.getX() * (p1.getY() - p2.getY()) == 0;
    }
    public static void distance(Point p1, Point p2) {
        double distance = Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
        System.out.println(distance);
    }
    public static void AreaAndPerimeter(Point p1, Point p2, Point p3) {
        if(!collinear(p1, p2, p3)) {
            double s = (p1.getX() * (p2.getY() - p3.getY()) + p2.getX() * (p3.getY() - p1.getY()) + p3.getX() * (p1.getY() - p2.getY())) / 2;
            double area = Math.abs(s);
            double perimeter = Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2)) + Math.sqrt(Math.pow(p2.getX() - p3.getX(), 2) + Math.pow(p2.getY() - p3.getY(), 2)) + Math.sqrt(Math.pow(p3.getX() - p1.getX(), 2) + Math.pow(p3.getY() - p1.getY(), 2));
            System.out.println("Area: " + area);
            System.out.println("Perimeter: " + perimeter);
        }
        else {
            System.out.println("Not a triangle. It is collinear.");
    }
    }
    public static void main(String[] args) {
        //Three points are collinear
        Point p1 = new Point(1, 1);
        Point p2 = new Point(1, 4);
        Point p3 = new Point(1, 5);


        //Three points are not collinear
        Point p4 = new Point(p1);
        p4.setX(1);
        p4.setY(2);
        Point p5 = new Point(p2);
        p5.setX(-3);
        p5.setY(1);
        Point p6 = new Point(p3);
        p6.setX(2);
        p6.setY(-5);


        //Distance between two points of three points collinear
        System.out.println("Distance between p1 and p2:");
        distance(p1, p2);
        System.out.println("Distance between p1 and p3:");
        distance(p1, p3);
        System.out.println("Distance between p2 and p3:");
        distance(p2, p3);

        //Distance between two points of three points not collinear
        System.out.println("Distance between p4 and p5:");
        distance(p4, p5);
        System.out.println("Distance between p4 and p6:");
        distance(p4, p6);
        System.out.println("Distance between p5 and p6:");
        distance(p5, p6);

        //Area and perimeter of three points collinear
        System.out.println("Area and perimeter p1, p2, p3:");
        AreaAndPerimeter(p1, p2, p3);

        //Area and perimeter of three points not collinear
        System.out.println("Area and perimeter p4, p5, p6:");
        AreaAndPerimeter(p4, p5, p6);
    }
}
