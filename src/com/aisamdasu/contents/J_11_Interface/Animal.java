package com.aisamdasu.contents.J_11_Interface;

public interface Animal {
    String name = "동물"; // public static이 기본임

    public void sound(); // public abstract void 가 기본임
    public default void eat(){
        System.out.println("먹다");
    } // 추후에 추가시 default로 만들어서 안써도 무방하도록 만들어준다.
    // 그러면서 동시에 기본적으로 먹다라고 출력되도록 해줌.
}
