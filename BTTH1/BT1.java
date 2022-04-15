package OOP.th1.java;

import java.util.Scanner;
public class BT1 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        int [] a = new int [n];
        System.out.print("Enter number of elements: \n");
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            a[i] = scanner.nextInt();
        }

        sort(a);
        System.out.println("Elements of array sorted in ascending order: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\nMean of elements: " + mean(a));
    }
    public static void sort(int [] a) {
        int temp = a[0];
        for (int i = 0 ; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
    }
    public static double mean(int [] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return (double) sum / a.length;
    }
}
