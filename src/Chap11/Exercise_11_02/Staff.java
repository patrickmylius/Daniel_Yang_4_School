/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 20-11-2020
 */
package Chap11.Exercise_11_02;

public class Staff extends Employee {
    private String title;

    //Constructer Staff w. args, using super to inherit from Employee
    public Staff(String name, String address, String phone, String email, int office, double salary, String title) {
        super(name, address, phone, email, office, salary);
        this.title = title;
    }

    //Getter for title
    public String getTitle() {
        return title;
    }

    //set title
    public void setTitle(String title) {
        this.title = title;
    }

    //overwriting toString method, returning string description of class
    public String toString() {
        return super.toString() + "\nTitle: " + title;
    }

}
