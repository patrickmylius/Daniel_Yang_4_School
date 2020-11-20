/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 20-11-2020
 */
package Chap11.Exercise_11_02;

public class Faculty extends Employee {
    private String officeHours;
    private String rank;

    //Constructer Faculty w. args, using super to inherit from Employee
    public Faculty(String name, String address, String phone, String email, int office, double salary, String officeHours, String rank) {
        super(name, address, phone, email, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    //getter for officehours
    public String getOfficeHours() {
        return officeHours;
    }

    //set office hours
    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    //getter for rank
    public String getRank() {
        return rank;
    }

    //set Rank
    public void setRank(String rank) {
        this.rank = rank;
    }

    //overwriting toString method, returning string description of class
    public String toString() {
        return super.toString() + "\nOffice hours: " + officeHours + "\nRank: " + rank;
    }
}
