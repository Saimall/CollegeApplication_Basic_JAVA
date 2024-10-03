package org.example;

public class Semester {

    public Semester(int id, int sub1, int sub2, int sub3, int sub4, int pract1, int practt2) {
        this.id = id;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
        this.pract1 = pract1;
        this.practt2 = practt2;
    }
    private int id;

    private int sub1;
    private int sub2;
    private int sub3;
    private int sub4;

    private int pract1;
    private int practt2;




    public void setId(int id) {
        this.id = id;
    }

    public void setSubject(int sub1,int sub2,int sub3,int sub4) {
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.sub4 = sub4;
    }


    public void setPracticals(int pract1,int pract2) {
        this.pract1 = pract1;
        this.practt2=pract2;
    }




    @Override
    public String toString() {
        return "Semester{" +
                "id=" + id +
                ", sub1=" + sub1 +
                ", sub2=" + sub2 +
                ", sub3=" + sub3 +
                ", sub4=" + sub4 +
                ", pract1=" + pract1 +
                ", practt2=" + practt2 +
                '}';
    }

    public int getSub1() {
        return sub1;
    }

    public int getId() {
        return id;
    }

    public int getSub2() {
        return sub2;
    }

    public int getSub3() {
        return sub3;
    }

    public int getSub4() {
        return sub4;
    }

    public int getPract1() {
        return pract1;
    }

    public int getPractt2() {
        return practt2;
    }
}
