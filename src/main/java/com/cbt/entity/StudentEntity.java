/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cbt.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Gbubemi
 */
@Entity
@Table(name="Students")
public class StudentEntity implements Serializable{
    
    private String id;
    private String firstname;
    private String lastname;
    private String studentclass;
    private String password;
    
    
    public StudentEntity(){
    }

    public StudentEntity(String id,String firstname, String lastname, String student_class ) {
        this.id=id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.studentclass = student_class;
        this.password = "school";
        
    }
   
    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getStudentclass() {
        return studentclass;
    }

    public void setStudentclass(String studentclass) {
        this.studentclass = studentclass;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   
}
