package ar.edu.udeci.pv.collections;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Producer implements Runnable{

    private BlockingQueue<String> drop;
    List<String> messages = Arrays.asList(
            "Mares eat oats",
            "Does eat oats",
            "Little lambs eat ivy",
            "Wouldn't you eat ivy too?");

    public Producer(BlockingQueue<String> d) { this.drop = d; }

    public void run(){
        try {
            for (String s : messages){
                drop.put(s);
            }
        }catch (InterruptedException intEx) {
            System.out.println("Interrupted! " +
                    "Last one out, turn out the lights!");
        }
    }
}

class Consumer implements Runnable{

    private BlockingQueue<String> drop;
    private String name;

    public Consumer(BlockingQueue<String> d, String name){
        this.drop = d;
        this.name = name;
    }

    public void run(){
        try{
            String msg = null;

            while (drop.size()>0) {
                System.out.println(name + " -> extract data : " + drop.take());
                Thread.sleep(100);
            }
        }catch(InterruptedException intEx){
            System.out.println("Interrupted! " +
                    "Last one out, turn out the lights!");
        }
    }
}

public class ArrayBlockingQueuApp {

    public static void main(String[] args) {
        BlockingQueue<String> drop = new ArrayBlockingQueue(1, true);
        (new Thread(new Producer(drop))).start();
        (new Thread(new Consumer(drop,"name 2"))).start();
        (new Thread(new Consumer(drop,"name 1"))).start();
    }
}
