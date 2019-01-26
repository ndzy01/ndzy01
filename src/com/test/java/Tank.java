package com.test.java;

import java.util.Vector;

/**
 * @author Zhang Yi
 * @create 2019- 01- 24- 15:17
 * @function
 */

public class Tank {
    //构造函数
    public Tank(int x, int y) {
        this.x = x;
        this.y = y;

    }

    //坦克初始坐标
    int x = 100;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    int y = 100;

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }


    //坦克初始速度
    int speed = 3;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    //坦克颜色
    int color = 0;

    public void setColor(int color) {
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    //坦克类型
    int type = 0;

    public void setType(int type) {
        this.type = type;
    }

    public int getType() {
        return type;
    }

    //坦克初始朝向
    //0朝上, 1朝右，2朝下，3朝左
    int direction = 0;

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getDirection() {
        return direction;
    }

    //坦克走向
    //朝上
    public void moveUp() {
        y -= speed;
    }

    //朝右
    public void moveRight() {
        x += speed;
    }

    //朝下
    public void moveDowm() {
        y += speed;
    }

    //朝左
    public void moveLeft() {
        x -= speed;
    }
    //
}
class MyTank extends Tank {
    public MyTank(int x, int y) {
        super(x, y);
    }

    Vector<Zdan> ss=new Vector<Zdan>();
    Zdan z = null;

    public void shot() {
        switch (this.direction) {
            case 0:
        z = new Zdan(x + 8, y - 5, 0);
        ss.add(z);
        break;
        case 1:
        z = new Zdan(x + 32, y + 8, 1);
        ss.add(z);
        break;
        case 2:
        z = new Zdan(x + 8, y + 32, 2);
        ss.add(z);
        break;
        case 3:
        z = new Zdan(x - 2, y + 8, 3);
        ss.add(z);
        break;
    }
        Thread t = new Thread(z);
        t.start();
    }
}


class  QTank01 extends Tank implements Runnable {
    boolean isLive = true;
    int times = 2;
    //
    //敌人添加子弹，在坦克刚创建和坦克子弹死亡

    Vector<Zdan> ss01= new Vector<Zdan>();

    public QTank01(int x, int y) {
        super(x, y);
    }

    @Override
    public void run() {
        int numbers=10;
        while (true) {
            switch (this.direction) {
                case 0:
                    for (int i = 0; i < numbers; i++) {
                        //坦克此时在向上走
                        if (y > 5) {
                            y -= speed;
                        }
                        try {
                            Thread.sleep(50);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 1:
                    for (int i = 0; i < numbers; i++) {
                        if (x < 750) {
                            x += speed;
                        }
                        try {
                            Thread.sleep(50);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 2:
                    for (int i = 0; i < numbers; i++) {
                        if (y < 520) {
                            y += speed;
                        }
                        try {
                            Thread.sleep(50);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 3:
                    for (int i = 0; i < numbers; i++) {
                        if (x > 5) {
                            x -= speed;
                        }
                        try {
                            Thread.sleep(50);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    break;
            }
            this.times++;
            if (times % 2 == 0) {
                if (ss01.size() < 5) {
                    Zdan z = null;
                    switch (direction) {
                        case 0:
                            z = new Zdan(x + 8, y - 5, 0);
                            ss01.add(z);
                            break;
                        case 1:
                            z = new Zdan(x + 32, y + 8, 1);
                            ss01.add(z);
                            break;
                        case 2:
                            z = new Zdan(x + 8, y + 35, 2);
                            ss01.add(z);
                            break;
                        case 3:
                            z = new Zdan(x - 5, y + 8, 3);
                            ss01.add(z);
                            break;
                    }
                    Thread t=new Thread(z);
                    t.start();
                }
            }

            //坦克随机产生一个方向

            this.direction = (int) (Math.random() * 4);


            //判断敌方坦克是否死亡
            if (this.isLive == false) {
                break;
            }
        }
    }
}

