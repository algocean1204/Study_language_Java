package com.aisamdasu.contents.J_27_Enum.step7;

// enum도 getter, 생성자, 기본 생성자(필수) 를 만들 수 있다.
public enum TrafficLight {
    RED("정지"), GREEN("직진"), ARROW("좌회전");

    private String command;
    private TrafficLight(){}
    private TrafficLight(String command) {
        this.command = command;
    }
    public String getCommand() {
        return command;
    }
}
