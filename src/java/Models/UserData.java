/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;


import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author RAHIL
 */
@Entity
public class UserData implements Serializable {
    
    
    public UserData(String firstName, String lastName, String phoneNo, String EmailId, String passWord, char gender, Date dateOB, char userType, String Address,String idNum) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNo = phoneNo;
        this.EmailId = EmailId;
        this.passWord = passWord;
        this.gender = gender;
        this.dateOB = dateOB;
        this.userType = userType;
        this.Address = Address;
        this.idNum=idNum;
    }

    public UserData() {
    }
    
    
    
    
    private String firstName;    
        
        
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    
    
    private String lastName;
        
    
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    
    
    private String phoneNo;

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    
    @Id
    private String EmailId;
        
    public String getEmailId() {
        return EmailId;
    }

    public void setEmailId(String EmailId) {
        this.EmailId = EmailId;
    }
    
    
    private String passWord;
        
    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    
    
    private char gender;
        
    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
    
    
    
    private Date dateOB;
        

    public Date getDateOB() {
        return dateOB;
    }

    public void setDateOB(Date dateOB) {
        this.dateOB = dateOB;
    }

    
    
    private char userType;
        
    public char getUserType() {
        return userType;
    }

    public void setUserType(char userType) {
        this.userType = userType;
    }
    
    
    
    private String Address;
    
    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    
    private String idNum;

    public String getIdNum() {
        return idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }
    
    
}
