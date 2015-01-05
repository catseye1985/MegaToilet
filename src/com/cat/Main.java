package com.cat;

public class Main {

    public static void main(String[] args) {
	    boolean pottyreturn;
        MegaToilet myToilet;

        System.out.println("Hello World!");

        myToilet = new MegaToilet();
        System.out.println("weight of toilet = " + myToilet.weight);

        System.out.println("now flushing " + 100+ " times");
        for(int i = 0; i<100; i++){
            System.out.println("current number of poops = " + myToilet.numberOfPoops);
            myToilet.flush();
        }
        System.out.println("number of poos = " + myToilet.numberOfPoops);

        pottyreturn = pottymouth("tunnel");
        System.out.println(pottyreturn);
    }

    public static boolean pottymouth(String phrase){
        if(phrase.equals("tunnel")){
            return true;
        }else{
            return false;
        }
    }
}
