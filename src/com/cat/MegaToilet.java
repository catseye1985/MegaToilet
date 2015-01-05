package com.cat;

/**
 * Created by j3gb3rt on 1/4/2015.
 */
public class MegaToilet {
    int numberOfPoops;
    double gallonsInTank;
    Double weight;

    public MegaToilet(){
        numberOfPoops = 0;
        gallonsInTank = 5.4;
        weight = new Double(36);

        System.out.println("Toilet get!!");
    }

    public void flush(){
        numberOfPoops++;
    }
}
