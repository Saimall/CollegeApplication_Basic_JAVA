package org.example;


public class Main {
    public static void main(String[] args) {

        Semester s1=new Semester(11,89,77,69,99,8,9);
        Semester s2=new Semester(12,59,87,80,79,6,8);
        Semester s3=new Semester(21,68,67,88,89,9,8);
        Semester s4=new Semester(22,76,77,88,99,4,6);

       Student stud1 = new Student(101,"CSE");

       stud1.getSemesterList().put(s1.getId(),s1);
        stud1.getSemesterList().put(s2.getId(),s2);
        stud1.getSemesterList().put(s3.getId(),s3);
        stud1.getSemesterList().put(s4.getId(),s4);

        Semester sem1=new Semester(11,45,57,62,67,23,30);
        Semester sem2=new Semester(12,76,43,66,59,21,10);
        Semester sem3=new Semester(21,56,57,58,59,21,23);
        Semester sem4=new Semester(22,56,57,58,59,21,23);


        Student stud2 = new Student(102,"CSM");



        stud2.getSemesterList().put(sem1.getId(),sem1);
        stud2.getSemesterList().put(sem2.getId(),sem2);
        stud2.getSemesterList().put(sem3.getId(),sem3);
        stud2.getSemesterList().put(sem4.getId(),sem4);


        Exambranch exambranch = new Exambranch();
        exambranch.getStudentList().add(stud1);
        exambranch.getStudentList().add(stud2);

        System.out.println(exambranch.getstudentById(102).toString());

        System.out.println(exambranch.getstudentByIdBySemester(101,11));
        System.out.println(exambranch.getstudentByIdBySemesterPraticals(101,11,1));


        System.out.println("Grade of Student "+exambranch.getStudentGrade(102));
    }
}