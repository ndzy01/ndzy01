package com.zhangyi06.java;

/**
 * @author Zhang Yi
 * @create 2019- 01- 25- 11:05
 * @function
 */

public class Demo04 {
    public static void main(String[] args) {
        Dog04 dog04 = new Dog04();
        Thread t = new Thread(dog04);
        t.start();

    }
}
class Dog04 implements Runnable {
    int times = 0;

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            times++;
            System.out.println("Hello World!+" + times);

            if (times == 10) {
                break;
            }

        }

    }
}