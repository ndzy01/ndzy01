package com.test.java;

/**
 * @author Zhang Yi
 * @create 2019- 01- 28- 16:34
 * @function
 */

public class Recorder {
    private static int enNumber=7;
    private static int mylife=1;

    private  static int allNumber=0;


    public static int getEnNumber() {
        return enNumber;
    }

    public static void setEnNumber(int enNumber) {
        Recorder.enNumber = enNumber;
    }

    public static int getMylife() {
        return mylife;
    }

    public static void setMylife(int mylife) {
        Recorder.mylife = mylife;
    }


    public static void reduceNum(){
        enNumber--;
    }

    public static void addNum(){
        allNumber++;

    }
    public static void reduce_mylife_Num(){
        mylife--;

    }


    public static int getAllNumber() {
        return allNumber;
    }

    public static void setAllNumber(int allNumber) {
        Recorder.allNumber = allNumber;
    }
}
