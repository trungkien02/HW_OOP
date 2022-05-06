package B1;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class WriteArraytoFile {
    public static ArrayList<Double> readFile() throws FileNotFoundException {
        File txt = new File("D:\\learning\\OOP\\BTTH4\\src\\B1\\dayso.txt");
        Scanner scan = new Scanner(txt);
        ArrayList<Double> data = new ArrayList<Double>();
        while (scan.hasNextDouble()) {
            data.add(scan.nextDouble());
        }
        return data;
    }

    public static void main(String[] args) throws IOException {
        ArrayList<Double> data = readFile();
        data.sort(null);
        try {
            FileWriter  myWriter  = new FileWriter("D:\\learning\\OOP\\BTTH4\\src\\B1\\sapxep.txt");
            for (int i = 0; i < data.size(); i++) {
                myWriter.write(data.get(i) + " ");
            }
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}