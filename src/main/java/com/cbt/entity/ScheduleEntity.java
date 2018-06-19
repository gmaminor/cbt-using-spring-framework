package com.cbt.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Gbubemi
 */
@Entity
@Table(name = "schedule")
public class ScheduleEntity implements Serializable {

    public ScheduleEntity() {
    }
    private String testcode;
    private String title;
    private int duration;
    private Date creation_date;
    private String username;

    public ScheduleEntity(String testcode, String title, int duration, String username) {
        this.testcode = testcode;
        this.title = title;
        this.duration = duration;
        this.creation_date = new Date();
        this.username = username;
        System.out.println("goati"+creation_date);
    }

    @Id
    public String getTestcode() {
        return testcode;
    }

    public void setTestcode(String testcode) {
        this.testcode = testcode;
    }

    @NotNull
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @NotNull
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Temporal(TemporalType.DATE)
    public Date getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}
