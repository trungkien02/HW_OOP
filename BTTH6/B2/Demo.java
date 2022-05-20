package B2;

public class Demo {
    public static void main(String[] args)
    {
        double[] arr =  new double[] {1, 2, 3};
        double[] arr2 =  new double[] {4, 5, 6};
        Vector x = new Vector(arr, arr.length);
        Vector y = new Vector(arr2, arr2.length);
        Vector z = new Vector(arr, arr.length);

        System.out.println("Do dai cua x: " + x.dodai());
        System.out.println("Cong x + y: ");
        z.cong(x, y, z);
        System.out.println(z.toString());
        System.out.println("Tru x - y: ");
        z.tru(x, y, z);
        System.out.println(z.toString());
        System.out.println("Nhan x với 3: ");
        z.nhan(x, 3);
        System.out.println(z.toString());
        System.out.println("Vector don vi cua x: " + z.vtdonvi(x));
    }
}
