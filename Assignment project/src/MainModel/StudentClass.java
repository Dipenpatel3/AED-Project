/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MainModel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author dipenpatel
 */
public class StudentClass {
    private String FirstName;
    private String LastName;
    private String ContactDetails;
    private String UserID;
    private String Password;
    private String NEUID;
    private String EmailId;
    private int generateTrans;
    private String CheckTrans;
    private int checkTran123s;
    private String Term;
    static Map<String,String> hashMap=new HashMap<>();

    public static Map<String, String> getHashMap() {
        return hashMap;
    }

    public static void setHashMap(Map<String, String> hashMap) {
        StudentClass.hashMap = hashMap;
    }
    
    public String getTerm() {
        return Term;
    }

    public void setTerm(String Term) {
        this.Term = Term;
    }
    
    public int getCheckTran123s() {
        return checkTran123s;
    }

    public void setCheckTran123s(int checkTran123s) {
        this.checkTran123s = checkTran123s;
    }
    
    public String getCheckTrans() {
        return CheckTrans;
    }

    public void setCheckTrans(String CheckTrans) {
        this.CheckTrans = CheckTrans;
    }
    
    public int getGenerateTrans() {
        return generateTrans;
    }

    public void setGenerateTrans(int generateTrans) {
        this.generateTrans = generateTrans;
    }


    
    private ArrayList<String> addcourses;
    
    public ArrayList<String> getAddcourses() {
        return addcourses;
    }

    public void addcourse(String Course){
        addcourses.add(Course);
    }
    
    public StudentClass(){
        this.addcourses=new ArrayList<String>();
    }
    
    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getContactDetails() {
        return ContactDetails;
    }

    public void setContactDetails(String ContactDetails) {
        this.ContactDetails = ContactDetails;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getNEUID() {
        return NEUID;
    }

    public void setNEUID(String NEUID) {
        this.NEUID = NEUID;
    }

    public String getEmailId() {
        return EmailId;
    }

    public void setEmailId(String EmailId) {
        this.EmailId = EmailId;
    }
    @Override
    public String toString(){
       return FirstName; 
    }

}
