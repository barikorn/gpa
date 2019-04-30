package gpa;

/***
 * This holds all the information about courses.
 * It returns the course info and allows for the program to
 * set the different course information in a project manager.
 * @author Leziga Barikor
 * @version 1.0 April 30, 2019
 */

public class Course {
    // Instance variables
    private String title;
    private String subject;
    private String courseNumber;
    private int creditHours;
    private boolean major;
    private Grade grade;
    private String semester;

    // Constructors
    public Course(String aTitle, String aSubject, String aCourseNum){
        // Fill in basic info
        title = aTitle;
        subject = aSubject;
        courseNumber = aCourseNum;
    }

    // Methods
    public void setGrade(String aGrade){
        // Convert grade to Grade
        if(aGrade == "A"){
            grade = Grade.A;
        }
        else if(aGrade == "A-"){
            grade = Grade.A_MIN;
        }
        else if(aGrade == "B+"){
            grade = Grade.B_PLUS;
        }
        else if(aGrade == "B"){
            grade = Grade.B;
        }
        else if(aGrade == "B-"){
            grade = Grade.B_MIN;
        }
        else if(aGrade == "C+"){
            grade = Grade.C_PLUS;
        }
        else if(aGrade == "C"){
            grade = Grade.C;
        }
        else if(aGrade == "C-"){
            grade = Grade.C_MIN;
        }
        else if(aGrade == "D+"){
            grade = Grade.D_PLUS;
        }
        else if(aGrade == "D"){
            grade = Grade.D;
        }
        else if(aGrade == "D-"){
            grade = Grade.D_MIN;
        }
        else if(aGrade == "WF"){
            grade = Grade.WF;
        }
        else {
            grade = Grade.F;
        }
    }

    public float getGrade(){
        return grade.getNamVal();
    }

    public void setMajor(String forMajor){
        if(forMajor == "yes"){
            major = true;
        }
        else{
            major = false;
        }
    }

    public boolean forMajor(){
        return major;
    }

    public void setSemester(String aSemester){
        semester = aSemester;
    }

    public String getSemester(){
        return semester;
    }

    public void setCreditHours(int credits){
        creditHours = credits;
    }

    public int getCreditHours(){
        return creditHours;
    }

//    This could potentially replace all my current setters.
//    public Course setCourseInfo(Course aCourse, String grade, String major, int credits, String semester){
//        aCourse.setGrade(grade);
//        aCourse.setMajor(major);
//        aCourse.setCreditHours(credits);
//        aCourse.setSemester(semester);
//        return aCourse;
//    }
}
