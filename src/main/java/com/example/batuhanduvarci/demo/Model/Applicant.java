package com.example.batuhanduvarci.demo.Model;

import javax.persistence.*;
import java.io.File;

@Entity
public class Applicant{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String eMail;
    private String phone;
    private String thoughts;
    private File resume;

    protected Applicant(){}

    public Applicant(String name, String eMail, String phone, String thoughts, File resume) {
        this.name = name;
        this.eMail = eMail;
        this.phone = phone;
        this.thoughts = thoughts;
        this.resume = resume;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getThoughts() {
        return thoughts;
    }

    public void setThoughts(String thoughts) {
        this.thoughts = thoughts;
    }

    public File getResume() {
        return resume;
    }

    public void setResume(File resume) {
        this.resume = resume;
    }
}
