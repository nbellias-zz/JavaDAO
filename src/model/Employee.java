/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author nikolaos
 */
public class Employee {

    private String ssn;
    private String fname;
    private String lname;
    private LocalDate dob;

    public Employee() {
    }

    public Employee(String ssn, String fname, String lname, LocalDate dob) {
        this.ssn = ssn;
        this.fname = fname;
        this.lname = lname;
        this.dob = dob;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Employee{" + "ssn=" + ssn + ", fname=" + fname + ", lname=" + lname + ", dob=" + dob + '}';
    }

}
