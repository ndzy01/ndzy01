package com.zhangyi06.java;

/**
 * @author Zhang Yi
 * @create 2019- 01- 25- 11:24
 * @function
 */

public class Demo05 {
    public static void main(String[] args) {
        Pig05 pig05 = new Pig05(7);
        Birld05 birld05 = new Birld05(5);
        Thread t1 =new Thread(pig05);
        Thread t2 =new Thread(birld05);
        t1.start();
        t2.start();
    }
}
class  Pig05 implements  Runnable{
    int n=0;
    int times =0;
    public Pig05(int n){
        this.n=n;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hello World!");
            times ++;
            System.out.println("我是猪，我在输出第"+times+"次Hello World！");
            if(times==n){
                break;
            }
        }
    }
}
class  Birld05 implements  Runnable{
    int n=0;
    int times=0;
    int s=0;
    public Birld05(int n){
        this.n=n;
    }

    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            s+=(++times);
            System.out.println("正在计算第"+times+"次，当前结果是s="+s);
            if (n==times){
                System.out.println("最终结果是s="+s);
                break;
            }
        }
    }
}