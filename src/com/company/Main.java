package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        for(int i=1; i<=5;i++){
            MultyThreadingThing thing = new MultyThreadingThing(i);
            thing.start();
        }
    }
}
