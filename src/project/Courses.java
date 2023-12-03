/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;

import java.util.ArrayList;

/**
 *
 * @author joshokeeffe
 */
public class Courses {

    // declare variables
    private String courseName;
    private String courseId;
    private String courseTimes;
    private String spaces;

    // create a arraylist
    private static ArrayList<Courses> courseList = new ArrayList<>();

    // constructor
    public Courses(String courseName, String courseId, String courseTimes, String spaces) {
        this.courseName = courseName;
        this.courseId = courseId;
        this.courseTimes = courseTimes;
        this.spaces = spaces;
    }

    // setters
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setCourseTimes(String courseTimes) {
        this.courseTimes = courseTimes;
    }

    public void setSpaces(String spaces) {
        this.spaces = spaces;
    }

    public static void setCourseList(ArrayList<Courses> courseList) {
        Courses.courseList = courseList;
    }

    // getters
    public String getCourseName() {
        return courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseTimes() {
        return courseTimes;
    }

    public String getSpaces() {
        return spaces;
    }

    // method to add course and course info to the arraylist
    public Courses() {
        // Object Orientated Programming
        courseList.add(new Courses("Object Orientated Programming", "101", "Mon: 12:00-14:00, Tue: 10:00-12:00", "25"));

        // Web Application Development
        courseList.add(new Courses("Web Application Development", "102", "Wed: 14:00-16:00, Mon: 12:00-15:00", "20"));

        // Advanced Databases
        courseList.add(new Courses("Advanced Databases", "103", "Wed: 14:00-16:00, Mon: 12:00-15:00", "15"));

        // Data Communications & Networking
        courseList.add(new Courses("Data Communications & Networking", "104", "Wed: 14:00-16:00, Mon: 12:00-15:00", "15"));
    }

    // method to retrieve course list
    public static ArrayList<Courses> getCourseList() {
        return courseList;
    }

    // method to get the course details and return it in a formatted string.
    public String getCourseDetails() {
        return "Course Name: " + courseName + "\n"
                + "Course ID: " + courseId + "\n"
                + "Course Times: " + courseTimes + "\n"
                + "Spaces: " + spaces;
    }

}
