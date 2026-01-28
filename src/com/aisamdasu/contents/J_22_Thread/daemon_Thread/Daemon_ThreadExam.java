package com.aisamdasu.contents.J_22_Thread.daemon_Thread;

public class Daemon_ThreadExam {
    public static void main(String[] args) {
        AutoSaveThread autoSaveThread = new AutoSaveThread();
        autoSaveThread.setDaemon(true);
        autoSaveThread.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("메인 스레드 종료");
    }
}
