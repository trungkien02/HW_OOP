package B1;

public class Demo {
    public static void main(String[] args){
        ComplexNumber nb1 = new ComplexNumber(1,2);
        ComplexNumber nb2 = new ComplexNumber(3, 4);
        System.out.println("ComplexNumber 1: ");
        System.out.println(nb1);
        System.out.println("ComplexNumber 2: ");
        System.out.println(nb2);
        System.out.println("Modulus of ComplexNumber 1: ");
        System.out.println(nb1.Modulus());
        System.out.println("Comparing ComplexNumber 1 and 2: "+ nb1.compare(nb2));
        System.out.println(nb1.add(nb2));
        System.out.println(nb1.sub(nb2));
        System.out.println(nb1.mul(nb2));
        System.out.println(nb1.div(nb2));
        System.out.println(nb1.mulByRealNb(2));
        System.out.println(nb1.conjugate());
    }
}
