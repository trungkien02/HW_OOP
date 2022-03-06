package OOP.hw2.java;

import java.util.Scanner;
import java.math.BigInteger;
public class SumofLargeFib {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = scanner.nextInt();
        while (n < 0 || n >= 100) {
            System.out.println("Enter again");
            System.out.println("Enter n: ");
            n = scanner.nextInt();
        }
        System.out.println("Fib(" + n + ") = " + Fib(n));
        System.out.println("sumofLargeFib(" + n + ") = " + sumofLargeFib(n));
    }
    public static BigInteger Fib(int n) {
        BigInteger a = BigInteger.valueOf(0);
        BigInteger b = BigInteger.valueOf(1);
        BigInteger c = BigInteger.valueOf(1);

        for (int i = 0; i < n; i++) {
            c = a.add(b);
            a = b;
            b = c;
        }
        return c;
    }
    public static BigInteger sumofLargeFib(int n) {
        BigInteger a = BigInteger.valueOf(0);
        BigInteger b = BigInteger.valueOf(1);
        BigInteger c = BigInteger.valueOf(1);
        BigInteger sum = BigInteger.valueOf(0);
        for (int i = 0; i < n; i++) {
            c = a.add(b);
            a = b;
            b = c;
            sum = sum.add(c);
        }
        return sum.add(BigInteger.valueOf(1));
    }
}


