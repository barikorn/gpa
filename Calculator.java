package gpa;

import java.util.ArrayList;

/***
 * This will calculate the gpa with given inputs.
 * @author Leziga Barikor
 * @version April 30, 2019
 */

public class Calculator {
    // Instance Variables
    private float totalGrades;
    private int totalCredits;
    private float gpa;

    // Constructor
    public Calculator(ArrayList<Course> coursesToAdd){
        // code here
        for(int i = 0; i < coursesToAdd.size(); i++){
            // Index through coursesToAdd
            Course tempCourse = coursesToAdd.get(i);
            totalGrades += tempCourse.getCreditHours() * tempCourse.getGrade();
            totalCredits += tempCourse.getCreditHours();
        }
        gpa = totalGrades / totalCredits;
    }
    // Methods
    public float getGPA(){
        return gpa;
    }
}
