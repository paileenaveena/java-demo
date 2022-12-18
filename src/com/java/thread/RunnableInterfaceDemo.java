package com.java.thread;

public class RunnableInterfaceDemo implements Runnable {
    @Override
    public void run() {
        System.out.println("In Run Method");

        for (int i = 0; i < 10; i++) {
            System.out.println("printing Run Method : " + i + "current thread" +Thread.currentThread());

        }
    }

    public static void main(String[] args) {
        System.out.println("In main method");

        RunnableInterfaceDemo rid = new RunnableInterfaceDemo();
        Thread td = new Thread(rid);
        td.start();
        td.setPriority(6);


        td.setName("saanvi");
        int i;
        for (i = 0; i < 10; i++) {
            System.out.println("printing main method : " + i);
        }
    }
}


