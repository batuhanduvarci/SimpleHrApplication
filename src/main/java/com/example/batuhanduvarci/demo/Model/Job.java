package com.example.batuhanduvarci.demo.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Job")
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String jobTitle;
    private String jobDescription;
    private Integer peopleAmount;
    private java.util.Date lastDate;

    protected Job(){}

    public Job(String jobTitle, String jobDescription, Integer peopleAmount, Date lastDate){
        this.jobTitle = jobTitle;
        this.jobDescription = jobDescription;
        this.peopleAmount = peopleAmount;
        this.lastDate = lastDate;
    }

    public Long getId() {
        return id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public Integer getPeopleAmount() {
        return peopleAmount;
    }

    public void setPeopleAmount(Integer peopleAmount) {
        this.peopleAmount = peopleAmount;
    }

    public java.util.Date getLastDate() {
        return lastDate;
    }

    public void setLastDate(Date lastDate) {
        this.lastDate = lastDate;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", jobDescription='" + jobDescription + '\'' +
                ", peopleAmount=" + peopleAmount +
                ", lastDate=" + lastDate +
                '}';
    }
}
