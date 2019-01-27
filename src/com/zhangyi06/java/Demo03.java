package com.zhangyi06.java;

/**
 * @author Zhang Yi
 * @create 2019- 01- 25- 10:37
 * @function
 */

public class Demo03 {
    public static void main(String[] args) {
        Cat01 cat01 = new Cat01();
        cat01.start();
    }
}
class Cat01 extends Thread{
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Hello World!");
        }
    }
}