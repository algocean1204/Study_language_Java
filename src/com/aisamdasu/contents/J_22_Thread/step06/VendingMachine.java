package com.aisamdasu.contents.J_22_Thread.step06;

public class VendingMachine { // 자판기
    private String order;
    private static String key = "Hello";

    public String getOrder() {
        return order;
    }

    // setOrder() 둘다 사용 가능

    /*
    public synchronized void setOrder(String order) {
        this.order = order;
        try{
            Thread.sleep(1000); // 주문처리시간 소요

        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " ordered " + getOrder());
    }

     */
    public void setOrder(String order) {
        synchronized (key){
            this.order = order;
            try{
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " ordered " + getOrder());
        }
    }
}
