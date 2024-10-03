package org.example;

import java.util.HashMap;
import java.util.Map;

public class Student {
    private int studid;
    private String department;
    private Map<Integer,Semester> SemesterList = new HashMap<Integer,Semester>();
//we can also do with ArrayList


    public Student(int studid, String department) {
        this.studid = studid;
        this.department = department;
    }


    public int getStudid() {
        return studid;
    }

    public void setStudid(int studid) {
        this.studid = studid;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<Integer, Semester> getSemesterList() {
        return SemesterList;
    }



    public void setSemesterList(Map<Integer, Semester> SemesterList) {
        this.SemesterList = SemesterList;
    }
    @Override
    public String toString() {
        return "Student{" +
                "studid=" + studid +
                ", department='" + department + '\'' +
                ", SemesterList=" + SemesterList +
                '}';
    }


}
