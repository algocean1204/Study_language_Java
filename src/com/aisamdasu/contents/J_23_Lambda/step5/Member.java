package com.aisamdasu.contents.J_23_Lambda.step5;

public class Member {
    private String name;
    private String id;

    public Member(String name, String id) {
        this.name = name;
        this.id = id;
        System.out.println("Member " + name + " " + id);
    }
    public Member() {
        System.out.println("Member()");
    }
    public Member(String id){
        System.out.println("Member(" + id + ")");
    }

}
