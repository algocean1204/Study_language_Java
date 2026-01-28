package com.aisamdasu.contents.J_22_Thread.step04;
/*
자바에서 쓰레드 만들기 2번
자식객체를 사용.
 */
public class FlagGame {
    public static void main(String[] args) {
        Thread thread = new FlagThread();
        thread.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("청기");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
