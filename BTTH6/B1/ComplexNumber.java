package B1;

public class ComplexNumber {
    protected double a;
    protected double b;

    public ComplexNumber(double a, double b){
        this.a = a;
        this.b = b;
    }
    public String toString(){
        if(a == 0)
            return (b +"i");
        else if(b == 0)
            return (Double.toString(a));
        else
            return (a + " + " + b + "i");
    }
    public double Modulus(){
        return Math.sqrt(a * a + b * b);
    }
    public boolean compare(ComplexNumber x){
        return a == x.a && b == x.b;
    }
    public String add(ComplexNumber x){
        System.out.println("Add 2 complex numbers: ");
        return (a + x.a + " + " + (b + x.b) + "i");
    }
    public String sub(ComplexNumber x){
        System.out.println("Subtract 2 complex numbers: ");
        return (a - x.a + " + " + (b - x.b) + "i");
    }
    public String mul(ComplexNumber x){
        System.out.println("Multiply 2 complex numbers: ");
        return (a * x.a - b * x.b + " + " + (a * x.b + b * x.a) + "i");
    }
    public String div(ComplexNumber x){
        System.out.println("Divide 2 complex numbers: ");
        return ((a * x.a + b * x.b) / (x.a * x.a + x.b * x.b) + " + " + (x.a * b - x.b * a) / (x.a * x.a + x.b * x.b) + "i");
    }
    public String mulByRealNb(double c){
        System.out.println("Multiply complex numbers by real numbers: ");
        return (a * c + " + " + b * c + "i");
    }
    public String conjugate(){
        System.out.println("Conjugate complex number: ");
        return (a + " - " + b + "i");
    }
}
