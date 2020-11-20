/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 20-11-2020
 */
package Chap11.Exercise_11_02;

public class Person {
    private String name;
    private String address;
    private String phone;
    private String email;

    //Construnt default person obj
    public Person() {
        this("Unknown", "Unknown", "Unknown", "Unknown");
    }

    //Construct Person obj with args.
    public Person(String name, String address, String phone, String email) {
    this.name = name;
    this.address = address;
    this.phone = phone;
    this.email = email;

    }

    //Getter for name
    public String getName() {
        return name;
    }

    //set name
    public void setName(String name) {
        this.name = name;
    }

    //getter for adress
    public String getAdress() {
        return address;
    }

    //set adress
    public void setAdress(String adress) {
        this.address = adress;
    }

    //getter for phone
    public String getPhone() {
        return phone;
    }

    //set phone
    public void setPhone(String phone) {
        this.phone = phone;
    }

    //Getter for email
    public String getEmail() {
        return email;
    }

    //set email
    public void setEmail(String email) {
        this.email = email;
    }

    //overwriting toString method, returning string description of class
    public String toString() {
        return "\nName: " + name + "\nAdress: " + address + "\nPhone: " + phone + "\nEmail: " + email;
    }

}
