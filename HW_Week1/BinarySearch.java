package OOP.hw1.java;

import java.util.Scanner;

public class BinarySearch {
    public static Scanner scanner = new Scanner(System.in);

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
    public static void main(String[] args) {
        int[] arr = {18, 30, 43, 44, 46, 51, 53, 74, 88, 94};
        System.out.println("Enter a number to search for: ");
        int key = scanner.nextInt();
        binarySearch(arr, key);
    }
}
