package com.aisamdasu.contents.J_22_Thread.step01;

public class FlagGame {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            System.out.println("청기");
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }


        for(int i = 0; i < 10; i++){
            System.out.println("백기");
            try{
                Thread.sleep(500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
