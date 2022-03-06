package OOP.hw2.java;
import java.io.*;
public class Matrix {
    public static void main(String[] args) throws IOException {
        BufferedReader reader;
        reader = new BufferedReader(new FileReader("D:\\matrix.txt"));

        String firstDimension = reader.readLine();
        String[] split = firstDimension.split(" ");
        int firstX = Integer.parseInt(split[0]);
        int firstY = Integer.parseInt(split[0]);

        int[][] first = new int[firstX][firstY];

        for (int i = 0; i < firstX; i++) {
            String[] line = reader.readLine().split(" ");

            for (int j = 0; j < firstY; j++) {
                first[i][j] = Integer.parseInt(line[j]);
            }

        }
        System.out.println("First matrix:");
        printMatrix(first);
        reader.readLine();


        String secondDimension = reader.readLine();
        String[] split2 = secondDimension.split(" ");
        int secondX = Integer.parseInt(split2[0]);
        int secondY = Integer.parseInt(split2[0]);

        int[][] second = new int[secondX][secondY];

        for (int i = 0; i < secondX; i++) {
            String[] line = reader.readLine().split(" ");

            for (int j = 0; j < secondY; j++) {
                second[i][j] = Integer.parseInt(line[j]);
            }

        }
        System.out.println("\nSecond matrix:");
        printMatrix(second);
        reader.close();
        sumMatrix(first, second);
        multMatrix(first, second);
        subMatrix(first, second);
        transposeMatrix(first);
        transposeMatrix(second);
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void sumMatrix(int[][] first, int[][] second) {
        int[][] sum = new int[first.length][first[0].length];
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[i].length; j++) {
                sum[i][j] = first[i][j] + second[i][j];
            }
        }
        System.out.println("\nSum matrix:");
        printMatrix(sum);
    }
    public static void multMatrix(int[][] first, int[][] second) {
        int[][] mult = new int[first.length][first[0].length];
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[i].length; j++) {
                mult[i][j] = first[i][j] * second[i][j];
            }
        }
        System.out.println("\nMult matrix:");
        printMatrix(mult);
    }
    public static void subMatrix(int[][] first, int[][] second) {
        int[][] sub = new int[first.length][first[0].length];
        for (int i = 0; i < first.length; i++) {
            for (int j = 0; j < first[i].length; j++) {
                sub[i][j] = first[i][j] - second[i][j];
            }
        }
        System.out.println("\nSub matrix:");
        printMatrix(sub);
    }
    public static void transposeMatrix(int[][] matrix) {
        int[][] transpose = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("\nTranspose matrix:");
        printMatrix(transpose);
    }
}