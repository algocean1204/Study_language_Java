package com.aisamdasu.contents.J_22_Thread.step02;

/*
자바에서 쓰레드 만드는법
1. Runnable 인터페이스 사용
 */
public class FlagTask implements Runnable{
    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            System.out.println("청기");
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
