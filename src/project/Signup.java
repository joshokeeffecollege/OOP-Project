/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

/**
 *
 * @author joshokeeffe
 */
public class Signup {

    // declare variables
    private String firstName;
    private String lastName;
    private String email;
    private String selectedCourse;

    // constructor
    public Signup(String firstName, String lastName, String email, String selectedCourse) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.selectedCourse = selectedCourse;
    }

    // empty constructor
    public Signup() {
        firstName = "";
        lastName = "";
        email = "";
        selectedCourse = "";
    }

    // setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSelectedCourse(String selectedCourse) {
        this.selectedCourse = selectedCourse;
    }
    
    // getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getSelectedCourse() {
        return selectedCourse;
    }

    // method to get users details and return a formatted string
    public String getDetails() {
        return "SignUp Information:"
                + "\nFirst Name: " + firstName
                + "\nLast Name: " + lastName
                + "\nEmail: " + email
                + "\nSelected Course: " + selectedCourse;
    }
}
