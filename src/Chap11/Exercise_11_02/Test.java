/**
 * Developed by Patrick Grønvold
 * patr6996@edu.easj.dk
 * Student of Computer Science
 * Zealand ErhvervsAkademi - 4700
 * 20-11-2020
 */
package Chap11.Exercise_11_02;

/*********************************************************************************
 * (The Person, Student, Employee, Faculty, and Staff classes) Design a           *
 * class named Person and its two subclasses named Student and Employee.          *
 * Make Faculty and Staff subclasses of Employee. A person has a name,            *
 * address, phone number, and email address. A student has a class status         *
 * (freshman, sophomore, junior, or senior). Define the status as a constant. An  *
 * employee has an office, salary, and date hired. Use the MyDate class defined   *
 * in Programming Exercise 10.14 to create an object for date hired. A faculty    *
 * member has office hours and a rank. A staff member has a title. Override the   *
 * toString method in each class to display the class name and the person’s name. *
 * Draw the UML diagram for the classes and implement them. Write a test program  *
 * that creates a Person, Student, Employee, Faculty, and Staff, and invokes      *
 * their toString() methods.                                                      *
 *********************************************************************************/

public class Test {
    public static void main(String[] args) {
        //Creating object of Person
        Person p1 = new Person("Patrick", "Astrupvej 13" , "30249031", "patrickgurgland@live.dk");

        //Creating object of Employee
        Employee e1 = new Employee("Lukas", "Langvej 31", "30934020", "lukahamgra@outlook.dk", 300, 45000);

        //Creating objects of Student
        Student s1 = new Student("Jeanne", "KBHroad 300", "20406080", "jeannehotland@mtw.com", Student.SENIOR);
        Student s2 = new Student("Lilje", "Sunroad 200", "40652030", "liljemorningstar@gmail.com", Student.FRESHMAN);

        //Creating object of staff
        Staff staff1 = new Staff("Kim", "Sunnyroad 20", "60293054", "kimlong@hotmail.com", 200, 25000, "Doorman");

        //Creating object of faculty
        Faculty f1 = new Faculty("Anders", "Longroad 40", "10203040", "andersand@live.dk", 100, 100000, "1am to 6am", "Lord of reins" );


        //Using toString methods with, Person, Employee, Student, Staff and Faculty
        System.out.println(p1.toString());
        System.out.println(e1.toString());
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(staff1.toString());
        System.out.println(f1.toString());

    }
}
