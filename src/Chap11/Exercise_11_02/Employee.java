/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 20-11-2020
 */
package Chap11.Exercise_11_02;

public class Employee extends Person {
    private int office;
    private double salary;
    private MyDate dateHired;

    //Constructer Employee w. args, using super to inherit person
    public Employee(String name, String address, String phone, String email, int office, double salary) {
    super(name, address, phone, email);
    this.office = office;
    this.salary = salary;
    this.dateHired = new MyDate();

    }
    //getter for Office
    public int getOffice() {
        return office;
    }
    //Setter for office
    public void setOffice(int office) {
        this.office = office;
    }
    //getter for salary
    public String getSalary() {
        return String.format("%.2f", salary);
    }
    //setter for salary
    public void setSalary(double salary) {
        this.salary = salary;
    }
    //getter for MyDate
    public String getDateHired() {
        return dateHired.getMonth() + "/" + dateHired.getDay() + "-" + dateHired.getYear();
    }
    //setter for date hired
    public void setDateHired() {
        dateHired = new MyDate();
    }

    //overwriting toString method, returning string description of class
    public String toString() {
        return super.toString() + "\nOffice: " + office + "\nSalary: $" + getSalary() + "\nDate hired: " + getDateHired();
    }

}
