package com.aisamdasu.contents.J_25_Stream.step2;

public class Member {
    private String name;
    private String gender;
    private int point;

    public Member(String name, String gender, int point) {
        this.name = name;
        this.gender = gender;
        this.point = point;

    }
    public int getPoint(){
        return point;
    }
    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
}
