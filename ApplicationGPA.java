package presentation;

/***
 * This runs the gpa package to allow for calculation
 * @author Leziga Barikor
 * @version April 30, 2019
 */

import gpa.Calculator;
import gpa.*;

import java.util.ArrayList;

public class ApplicationGPA {
    public static void main(String [] args){
        // Create a student
        Student testStudent = new Student();

        // Create 4 courses
        Course cs2530 = new Course("Intermediate CS","CS","2530");
        Course dm2030 = new Course("Media Computation","DM","2030");
        Course cs3120 = new Course("User Interface Design","CS","3120");
        Course dm3140 = new Course("Senior Seminar", "DM", "3140");

        // Set attributes to courses
        cs2530.setSemester("Fall 2018");
        cs2530.setMajor("yes");
        cs2530.setCreditHours(3);
        cs2530.setGrade("A"); // Next course
        cs3120.setSemester("Fall 2018");
        cs3120.setMajor("yes");
        cs3120.setCreditHours(1);
        cs3120.setGrade("B"); // Next course
        dm2030.setSemester("Fall 2018");
        dm2030.setMajor("No");
        dm2030.setCreditHours(3);
        dm2030.setGrade("A-"); // Next course
        dm3140.setSemester("Spring 2019");
        dm3140.setMajor("No");
        dm3140.setCreditHours(3);
        dm3140.setGrade("A"); // Next course

        // Create array list to iterate over
        ArrayList<Course> courses = new ArrayList<Course>();

        // Add elements to ArryList
        courses.add(0, cs2530);
        courses.add(1, dm2030);
        courses.add(2, cs3120);
        courses.add(3, dm3140);

        // Student adds course
        testStudent.addCourse(cs2530);
        testStudent.addCourse(dm2030);
        testStudent.addCourse(cs3120);
        testStudent.addCourse(dm3140);

        // Test Calculator
        Calculator cumCalc = new Calculator(courses);
        System.out.println(cumCalc.getGPA());

        // Test cumulative GPA
        System.out.println(testStudent.getCumulativeGPA());

        // Test semester GPA
        System.out.println(testStudent.getSemesterGPA("Fall 2018"));

        // Test major GPA
        System.out.println(testStudent.getMajorGPA());
    }
}
