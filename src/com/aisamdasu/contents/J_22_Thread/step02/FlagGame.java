package com.aisamdasu.contents.J_22_Thread.step02;

public class FlagGame {
    public static void main(String[] args) {
        Runnable flagTask = new FlagTask();
        Thread thread = new Thread(flagTask);
        thread.start();

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
