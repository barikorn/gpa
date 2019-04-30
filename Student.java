package gpa;

/***
 * This student object has the option of finding their
 * GPA for each semester, cumulative GPA, cumulative
 * major GPA.
 * @author Leziga Barikor
 * @version April 30, 2019
 */
import java.util.ArrayList;

public class Student {
    // ---- Instance Variables ----
    private ArrayList<Course> courses;
    private int courseIndex;

    // ---- Constructors -----
    public Student(){
        courses = new ArrayList<>();
        courseIndex = 0;
    }

    // ---- Methods ----
    public void addCourse(Course courseName){
        // Students adds courses to their array list
        if(courses.size() == courseIndex){
            courses.add(courseIndex, courseName);
            courseIndex += 1;
        }
        else if(courses.size() > courseIndex){
            courseIndex += 1;
        }
        else{
            courseIndex -= 1;
        }
    }
    public float getCumulativeGPA(){
        Calculator cumCalc = new Calculator(courses);
        return cumCalc.getGPA();
    }
    public float getSemesterGPA(String aSemester){
        ArrayList<Course> semesterCourses = new ArrayList<>();
        for(int i = 0; i < courses.size(); i++){
            // Index through coursesToAdd
            Course tempCourse = courses.get(i);
            if(aSemester == tempCourse.getSemester()){
                semesterCourses.add(tempCourse);
            }
        }
        Calculator semesterCalc = new Calculator(semesterCourses);
        return semesterCalc.getGPA();
    }
    public float getMajorGPA(){
        ArrayList<Course> majorCourses = new ArrayList<>();
        for(int i = 0; i < courses.size(); i++){
            // Index through coursesToAdd
            Course tempCourse = courses.get(i);
            if(tempCourse.forMajor()){
                majorCourses.add(tempCourse);
            }
        }
        Calculator majorCalc = new Calculator(majorCourses);
        return majorCalc.getGPA();
    }
}
