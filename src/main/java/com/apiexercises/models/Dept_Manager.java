package com.apiexercises.models;

import java.util.Date;

public class Dept_Manager {
    int emp_no;
    int dept_no;
    Date from_date;
    Date to_date;

    public int getEmp_no() {
        return emp_no;
    }

    public void setEmp_no(int emp_no) {
        this.emp_no = emp_no;
    }

    public int getDept_no() {
        return dept_no;
    }

    public void setDept_no(int dept_no) {
        this.dept_no = dept_no;
    }

    public Date getFrom_date() {
        return from_date;
    }

    public void setFrom_date(Date from_date) {
        this.from_date = from_date;
    }

    public Date getTo_date() {
        return to_date;
    }

    public void setTo_date(Date to_date) {
        this.to_date = to_date;
    }

    @Override
    public String toString() {
        return "Dept_Manager{" +
                "emp_no=" + emp_no +
                ", dept_no=" + dept_no +
                ", from_date=" + from_date +
                ", to_date=" + to_date +
                '}';
    }
}
