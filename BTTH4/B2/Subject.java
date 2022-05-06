package B2;

public class Subject {
    private int subjectCode;
    private String subjectName;
    private double x, y;

    Subject(int subjectCode, String subjectName, double x, double y) {
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.x = x;
        this.y = y;
    }

    public void setSubject(int subjectCode, String subjectName, double x, double y) {
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.x = x;
        this.y = y;
    }
    public double mean() {
        return 0.5*this.x + 0.5*this.y;
    }
}
