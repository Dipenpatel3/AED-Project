/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainModel;

import java.util.ArrayList;
import MainModel.CourseHistory;
/**
 *
 * @author dipenpatel
 */
public class ProfessorHistory {
    private ArrayList<Professor> ProfessorHistory;
    private ArrayList<Course> addedCourse;

    public ArrayList<Course> getAddedCourse() {
        return addedCourse;
    }

    public void setAddedCourse(ArrayList<Course> addedCourse) {
        this.addedCourse = addedCourse;
    }
   
    public ProfessorHistory(){
        this.ProfessorHistory = new ArrayList<Professor>();
        this.addedCourse=new ArrayList<Course>();
    }

    public ArrayList<Professor> getProfProfileHistory() {
        return ProfessorHistory;
    }
    
    public void setProfProfileHistory(ArrayList<Professor> ProfProfileHistory) {
        this.ProfessorHistory = ProfProfileHistory;
    }
    
    public Professor addPofessor(Professor professor){
        //Professor p = new Professor();
        ProfessorHistory.add(professor);
        return professor;
    }
    public void deleteProfessor(Professor Professor){
        ProfessorHistory.remove(Professor);
    }
    
    public Professor searchUserNameAndPassword(String userName, String password) {
        for (Professor p : ProfessorHistory) {
            if (p.getUserName().equals(userName) && p.getPassword().equals(password)) {
                return p;
            }
        }
        return null;
    }
//       public Professor viewProfessorCourse(String ID){
//        for(Course course:CourseHistory){
//            if(Professor.getUserName().equals(UserName)){
//            }
//        }
//        return null;
//    }
}
