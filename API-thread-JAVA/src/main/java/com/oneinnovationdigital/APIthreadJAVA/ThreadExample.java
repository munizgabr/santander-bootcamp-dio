package com.oneinnovationdigital.APIthreadJAVA;

public class ThreadExample {
    public static void main(String[] args) {
       LoadingBar2 barracarregamento = new LoadingBar2();
       barracarregamento.start();
        LoadingBar3 barracarregamento3 = new LoadingBar3();
        barracarregamento3.start();
    }
}

class PDFGenerator implements Runnable{
    @Override
    public void run() {
        System.out.println("Gerar pdf");
    }
}
class LoadingBar implements Runnable {
    @Override
    public void run() {
        System.out.println("Loading...");
    }
}
    class LoadingBar2 extends Thread{
        @Override
        public void run() {
            super.run();

            try {
                Thread.sleep(7000);
                System.out.println("executado LoadingBar2! -> "+this.getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
class LoadingBar3 extends Thread{
    @Override
    public void run() {
        super.run();
        try {
            Thread.sleep(1000);
            System.out.println("executado LoadingBar3! -> "+this.getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

