/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainModel;

import java.util.ArrayList;

/**
 *
 * @author dipenpatel
 */
public class CourseHistory {
    private ArrayList<Course> CourseHistory;
    
    public CourseHistory(){
        this.CourseHistory = new ArrayList<Course>();
    } 

    public ArrayList<Course> getCourseHistory() {
        return CourseHistory;
    }

    public void setCourseHistory(ArrayList<Course> CourseHistory) {
        this.CourseHistory = CourseHistory;
    }
    
    public Course createCourse(Course course){
        //Course c = new Course();
        CourseHistory.add(course);
        return course;
    }
   
    public Course searchCourse(String courseID,String courseName){
        for(Course course:CourseHistory){
            if(course.getCourseCode().equals(courseID) && course.getCourseName().equals(courseName)){
                return course;
            }
        }
        return null;
    }
}
