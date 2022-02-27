package OOP.hw1.java;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
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
        System.out.print("Enter key: ");
        int key = scanner.nextInt();
        binarySearch(a, key);
    }

    public static void binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;
        int mid = (low + high) / 2;
        while (low <= high) {
            if (key == arr[mid]) {
                System.out.println("Found " + key + " at index " + mid);
                break;
            } else if (key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
            mid = (low + high) / 2;
        }
        if (low > high) {
            System.out.println(key + " not found");
        }
    }
}
