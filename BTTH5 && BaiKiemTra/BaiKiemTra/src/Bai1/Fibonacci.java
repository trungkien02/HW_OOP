package Bai1;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Fibonacci{

    public static int fibonacci(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        PrintWriter writer = new PrintWriter("D:\\learning\\OOP\\BaiKiemTra\\src\\Bai1\\data.txt", "UTF-8");
        for (int i = 0; i < 1000; i++) {
            if (fibonacci(i) < 1000){
                writer.println(fibonacci(i)+"");
            }else{
                break;
            }
        }
        writer.close();
    }
}
