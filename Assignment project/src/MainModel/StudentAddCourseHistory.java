/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainModel;

import java.util.ArrayList;

/**
 *
 * @author shrikrishnanayak
 */
public class StudentAddCourseHistory {
    private ArrayList<StudentAddCourse> StudentAddCourseHistory;
    
    public StudentAddCourseHistory(){
        this.StudentAddCourseHistory = new ArrayList<StudentAddCourse>();
    } 

    public ArrayList<StudentAddCourse> getStudentAddCourseHistory() {
        return StudentAddCourseHistory;
    }

    public void setStudentAddCourseHistory(ArrayList<StudentAddCourse> StudentAddCourseHistory) {
        this.StudentAddCourseHistory = StudentAddCourseHistory;
    }
    
    public StudentAddCourse addCourse(StudentAddCourse StudentAddCourse){
        StudentAddCourseHistory.add(StudentAddCourse);
        return StudentAddCourse;
    }
}
