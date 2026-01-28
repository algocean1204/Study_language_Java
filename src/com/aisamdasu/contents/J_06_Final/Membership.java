package com.aisamdasu.contents.J_06_Final;

public class Membership {
    private final int memberNo;
	private final boolean permanent = true;
	private final String name;

    public Membership(int memberNo, String name) {
        this.memberNo = memberNo;
        this.name = name;
    }
    public String getInfo(){
        return memberNo + "-" + name;
    }
}
