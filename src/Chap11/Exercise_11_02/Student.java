/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 20-11-2020
 */
package Chap11.Exercise_11_02;

public class Student extends Person {
    private int status;
    public final static int FRESHMAN = 0;
    public final static int SOPHOMORE = 1;
    public final static int JUNIOR = 2;
    public final static int SENIOR = 3;

    //Constructer Student w. args, using super to inherit person
    public Student(String name, String address, String phone, String email, int status){
        super(name, address, phone, email);
        this.status = status;

    }
    //Setter for status
    public void setStatus(int status) {
        this.status = status;

    }
    //Running switch, returning status
    public String getStatus() {
        switch (status) {
            case 0: return "Freshman";
            case 1: return "Sophomore";
            case 2: return "Junior";
            case 3: return "Senior";
            default: return "Unknown";
        }
    }
    //overwriting toString method, returning string description of class
    public String toString() {
        return super.toString() + "\nStatus: " + getStatus();
    }
}
