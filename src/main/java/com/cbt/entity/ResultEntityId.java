package com.cbt.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable        
public class ResultEntityId implements Serializable  {
    @Column(name="regno")
    private String regNo;
    @Column(name="testcode")
    private String testCode;

    public ResultEntityId() {
    }

    public ResultEntityId(String Reg_no, String testcode) {
        this.regNo = Reg_no;
        this.testCode = testcode;
    }

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getTestCode() {
        return testCode;
    }

    public void setTestCode(String testCode) {
        this.testCode = testCode;
    }

}
