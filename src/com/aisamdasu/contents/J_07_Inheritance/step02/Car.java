package com.aisamdasu.contents.J_07_Inheritance.step02;

public class Car {
    private String manufacture;

    public Car(String manufacture){
        super(); // object 상속시 안써도 무방함 -> 컴파일러가 직접 만들어줌
        this.manufacture = manufacture;
    }
    public String getManufacture() {
        return manufacture;
    }
    public void drive(){
        System.out.println("drive~");
    }
    public void stop(){
        System.out.println("stop~");
    }
}
