package com.java.thread;

public class ThreadDemo extends Thread{
    @Override
    public void run() {
        super.run();
        System.out.println("Execution Run method");
        for (int i = 0; i < 10; i++) {
            System.out.println("printing run method : " + i);

        }
    }

            public static void main(String[]args){
                System.out.println("Executing main thread");

                ThreadDemo td = new ThreadDemo();
                Thread t = new Thread(td);
                t.start();
                t.getName();
            }
        }
