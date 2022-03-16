package com.company;
public class MultyThreadingThing extends Thread{
    private int threadNum;

    public MultyThreadingThing(int threadNum) {
        this.threadNum = threadNum;
    }

    @Override
    public void run(){
        for (int i=1; i<=5; i++){
            System.out.printf("Thread number: %d counter: %d\n",this.threadNum,i);
            try {
                sleep(1000);
            }
            catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
