package com.funtalk.start;

public class ModuleTask implements  Runnable {

    private int taskNum;

    public ModuleTask(int num) {
        this.taskNum = num;
    }

    public void run() {

        System.out.println("正在执行task "+taskNum);
        try {
            Thread.currentThread().sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("task "+taskNum+"执行完毕");

    }
}
