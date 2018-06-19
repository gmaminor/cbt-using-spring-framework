package com.cbt.entity;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "resultentity")
//@IdClass(ResultEntityId.class)
public class ResultEntity implements Serializable {

    public ResultEntity() {
    }

    @EmbeddedId
    private ResultEntityId resultId;
    private int studentScore;
    private int totalMark;
    private int totalNumberOfQuestions;
    private int answeredQuestions;
    private int unAnsweredQuestions;

    public ResultEntity(ResultEntityId resultId, int studentScore, int totalMark, int totalNumberOfQuestions, int answeredQuestions, int unAnsweredQuestions) {
        this.resultId = resultId;
        this.studentScore = studentScore;
        this.totalMark = totalMark;
        this.totalNumberOfQuestions = totalNumberOfQuestions;
        this.answeredQuestions = answeredQuestions;
        this.unAnsweredQuestions = unAnsweredQuestions;
    }

    ResultEntityId getResultId() {
        return resultId;
    }

    void setResultId(ResultEntityId resultId) {
        this.resultId = resultId;
    }

    public int getStudentScore() {
        return studentScore;
    }

    public void setStudentScore(int studentScore) {
        this.studentScore = studentScore;
    }

    public int getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(int totalMark) {
        this.totalMark = totalMark;
    }

    public int getTotalNumberOfQuestions() {
        return totalNumberOfQuestions;
    }

    public void setTotalNumberOfQuestions(int totalNumberOfQuestions) {
        this.totalNumberOfQuestions = totalNumberOfQuestions;
    }

    public int getAnsweredQuestions() {
        return answeredQuestions;
    }

    public void setAnsweredQuestions(int answeredQuestions) {
        this.answeredQuestions = answeredQuestions;
    }

    public int getUnAnsweredQuestions() {
        return unAnsweredQuestions;
    }

    public void setUnAnsweredQuestions(int unAnsweredQuestions) {
        this.unAnsweredQuestions = unAnsweredQuestions;
    }

}
