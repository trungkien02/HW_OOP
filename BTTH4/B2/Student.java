package B2;

import java.io.Serializable;
import java.util.Scanner;

public class Student implements Serializable {
    private int studentCode;
    private String name;
    private int n;
    private Subject[] subject;

    Scanner sc = new Scanner(System.in);
    Student(int studentCode, String name, int n) {
        this.studentCode = studentCode;
        this.name = name;
        this.n = n;
        subject = new Subject[n];
    }
    Student(){
    }
    public int getStudentCode() {
        return studentCode;
    }
    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getN() {
        return n;
    }
    public void setN(int n) {
        this.n = n;
    }
    public Subject[] getSubject() {
        return this.subject;
    }
    public void setSubject() {
        for (int i = 0; i < this.n; i++){
            System.out.print("Ma Mon Hoc: ");
            int ma = sc.nextInt();
            System.out.print("Ten Mon Hoc: ");
            String tenMonHoc = sc.nextLine();
            tenMonHoc = sc.nextLine();
            System.out.print("Diem Giua Ki: ");
            double diemGiuaKi = sc.nextDouble();
            System.out.print("Diem Cuoi Ki: ");
            double diemCuoiKi = sc.nextDouble();
            this.subject[i] = new Subject(ma, tenMonHoc, diemGiuaKi, diemCuoiKi);

        }
    }

    public static void main(String[] args) {
        Student st1 = new Student(22, "SHJFHSJVH", 2);
        st1.setSubject();
    }

}
