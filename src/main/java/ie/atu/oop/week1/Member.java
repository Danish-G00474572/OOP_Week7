package ie.atu.oop.week1;

import java.sql.SQLOutput;

public class Member {
    private String memberid;
    private String name;
    private int age;
    public Member(String memberid, String name, int age) {
        this.memberid = memberid;
        this.name = name;
        this.age = age;
    }

    public String getMemberid() {
        return memberid;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public void displayDetails(){
        System.out.println("Member ID: " +memberid);
        System.out.println("Name:" + name);
        System.out.println("Age: "+ age);
    }
}
