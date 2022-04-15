package OOP.th1.java;
class Point3d extends Point {
    double z;

    Point3d() {
        super();
        this.z = 0;
    }

    Point3d(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    Point3d(Point3d p) {
        super(p);
        this.z = p.z;
    }

    void setZ(double z) {
        this.z = z;
    }

    double getZ() {
        return this.z;
    }
}

class Point3dTest {
    public static void equation_plane(Point3d p1, Point3d p2, Point3d p3) {
        double a1 = p2.getX() - p1.getX();
        double b1 = p2.getY() - p1.getY();
        double c1 = p2.getZ() - p1.getZ();
        double a2 = p3.getX() - p1.getX();
        double b2 = p3.getY() - p1.getY();
        double c2 = p3.getZ() - p1.getZ();
        double a = b1 * c2 - b2 * c1;
        double b = a2 * c1 - a1 * c2;
        double c = a1 * b2 - b1 * a2;
        double d = -(a * p1.getX() + b * p1.getY() + c * p1.getZ());
        System.out.println("equation of plane is " + a +
                " x + " + b + " y + " + c +
                " z + " + d + " = 0.");
    }

    public static boolean Check_point_in_plane(Point3d p, Point3d p1, Point3d p2, Point3d p3) {
        double a1 = p2.getX() - p1.getX();
        double b1 = p2.getY() - p1.getY();
        double c1 = p2.getZ() - p1.getZ();
        double a2 = p3.getX() - p1.getX();
        double b2 = p3.getY() - p1.getY();
        double c2 = p3.getZ() - p1.getZ();
        double a = b1 * c2 - b2 * c1;
        double b = a2 * c1 - a1 * c2;
        double c = a1 * b2 - b1 * a2;
        double d = -(a * p1.getX() + b * p1.getY() + c * p1.getZ());
        if (a * p.getX() + b * p.getY() + c * p.getZ() + d == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Point3d p1 = new Point3d(-1, 2, 1);
        Point3d p2 = new Point3d(0, -3, 2);
        Point3d p3 = new Point3d(1, 1, -4);
        Point3d p4 = new Point3d(0, 0, 0);
        equation_plane(p1, p2, p3);
        System.out.println("p1 is in plane: " + Check_point_in_plane(p1, p1, p2, p3));
        System.out.println("p4 is in plane: " + Check_point_in_plane(p4, p1, p2, p3));
    }
}