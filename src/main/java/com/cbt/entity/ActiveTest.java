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
@Table
public class ActiveTest implements Serializable{

    private String id;
    private String examcode;

    public ActiveTest() {
    }

    public ActiveTest(String id, String examcode) {
        this.id = id;
        this.examcode = examcode;
    }
    @Id
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getExamcode() {
        return examcode;
    }

    public void setExamcode(String examcode) {
        this.examcode = examcode;
    }
    
}
