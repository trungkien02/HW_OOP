package OOP.th1.java;

public class Point {
    double x;
    double y;

    Point(){
        this.x = 0;
        this.y = 0;
    }
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
        if (!collinear(p1, p2, p3)) {
            double s = (p1.getX() * (p2.getY() - p3.getY()) + p2.getX() * (p3.getY() - p1.getY()) + p3.getX() * (p1.getY() - p2.getY())) / 2;
            double area = Math.abs(s);
            double perimeter = Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2)) + Math.sqrt(Math.pow(p2.getX() - p3.getX(), 2) + Math.pow(p2.getY() - p3.getY(), 2)) + Math.sqrt(Math.pow(p3.getX() - p1.getX(), 2) + Math.pow(p3.getY() - p1.getY(), 2));
            System.out.println("Area: " + area);
            System.out.println("Perimeter: " + perimeter);
        } else {
            System.out.println("Not a triangle. It is collinear.");
        }
    }
    public static void lineFromPoint(Point p1, Point p2) {
        double a = p2.y - p1.y;
        double b = p1.x - p2.x;
        double c = a * (p1.x) + b * (p1.y);
        if(b < 0) {
            System.out.println("The line passing through points P and Q is: "
                    + a + "x - " + b + "y = " + c);
        }
        else {
            System.out.println("The line passing through points P and Q is: "
                    + a + "x + " + b + "y = " + c);
        }
    }

    public static void main(String[] args) {
        //Three points are collinear
        Point p1 = new Point(1, 2);
        Point p2 = new Point(-3, 1);
        Point p3 = new Point(2, -5);

        Point p4 = new Point(3, 2);
        Point p5 = new Point(2, 6);
        System.out.println("Distance between p1 and p2:");
        distance(p1, p2);
        System.out.println("Distance between p1 and p3:");
        distance(p1, p3);
        System.out.println("Distance between p2 and p3:");
        distance(p2, p3);
        System.out.println("Area and perimeter p1, p2, p3:");
        AreaAndPerimeter(p1, p2, p3);
        lineFromPoint(p4, p5);
    }
}


