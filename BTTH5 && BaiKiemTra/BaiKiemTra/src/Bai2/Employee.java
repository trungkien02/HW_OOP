package Bai2;

public class Employee extends Person{
    private int employeeID;
    private double factor;
    private double basicSalary;

    public Employee() {}

    public Employee(String name,int employeeID, Double factor, Double basicSalary) {
        this.name = name;
        this.employeeID = employeeID;
        this.factor = factor;
        this.basicSalary = basicSalary;
    }

    public int getEmployeeID() {
        return employeeID;
    }
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public double getFactor() {
        return factor;
    }
    public void setFactor(double factor){
        this.factor = factor;
    }
    public double getBasicSalary(){
        return basicSalary;
    }
    public void setBasicSalary(double basicSalary){
        this.basicSalary = basicSalary;
    }

    public double SalaryOfMonth(){
        return factor * basicSalary;
    }
}
