package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Exambranch {
    private ArrayList<Student>studentList = new ArrayList<>();

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    public Student getstudentById(int id){

        Iterator<Student> itr = studentList.iterator();
        Student current=null;
        while(itr.hasNext()){
           current = itr.next();
            if(current.getStudid()==id){
                return current;
            }

        }
        return null;

    }


    public Semester getstudentByIdBySemester(int id,int semid){

        Iterator<Student> itr = studentList.iterator();
        Student current=null;

        while(itr.hasNext()){
              Student temp = itr.next();
            if(temp.getStudid()==id){
                current =temp;
            }
            Map<Integer,Semester> semlist = new HashMap<>();

            semlist = current.getSemesterList();

           for(int key:semlist.keySet()){
               if(key==semid){
                   return semlist.get(key);
               }
           }


        }
        return null;

    }



    public int getstudentByIdBySemesterPraticals(int id,int semid,int partical) {

        Iterator<Student> itr = studentList.iterator();
        Student current = null;
        int parcticalsmarks=0;

        while (itr.hasNext()) {
            Student temp = itr.next();
            if (temp.getStudid() == id) {
                current = temp;
            }

            Map<Integer, Semester> semlist = new HashMap<>();

            semlist = current.getSemesterList();
            Semester sem = null;



            for (int key : semlist.keySet()) {
                if (key == semid) {
                    sem = semlist.get(key);
                }
            }

            if (partical == 1) {
                parcticalsmarks= sem.getPract1();
            } else if (partical == 2) {
                parcticalsmarks =sem.getPractt2();
            }



        }
        return parcticalsmarks;

    }



    public Character getStudentGrade(int id){

        Iterator<Student> itr = studentList.iterator();
        Student current = null;

        while(itr.hasNext()){
            Student temp = itr.next();
            if(temp.getStudid()==id) {
                current = temp;


                Map<Integer, Semester> semlist = new HashMap<>();

                semlist = current.getSemesterList();

                int studentmarks = 0;


                for (int key : semlist.keySet()) {


                    Semester s = semlist.get(key);

                    studentmarks += s.getPract1() + s.getPract1() + s.getSub1() + s.getSub2() + s.getSub3() + s.getSub4();

                }

                int totalmarks = 1680;

                float percentage = (float) studentmarks / totalmarks * 100;

                if (percentage >= 90) {
                    return 'A';
                } else if (percentage >= 80 && percentage < 90) {
                    return 'B';
                } else if (percentage >= 70 && percentage < 80) {
                    return 'C';
                } else {
                    return 'D';
                }


            }
        }
        return null;
    }






}
