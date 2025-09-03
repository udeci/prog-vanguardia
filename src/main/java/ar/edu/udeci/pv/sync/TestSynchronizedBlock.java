package ar.edu.udeci.pv.sync;

class Table{
    synchronized void printTable(int n, String nm){
        for(int i=1;i<=5;i++){
            System.out.println(nm + " -> " + n*i);
            try{
                Thread.sleep(400);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

class MyThread extends Thread{

    Table table;
    int value;
    String name;

    MyThread(Table table, int value, String name){
        this.table = table;
        this.name = name;
        this.value = value;
    }
    public void run(){
        table.printTable(value, name);
        System.out.println("End " + name + " \r\n");
    }


}

public class TestSynchronizedBlock{

    public static void main(String args[]) throws InterruptedException {
        Table obj = new Table();//only one object
        MyThread t1=new MyThread(obj, 5, "T1");
        MyThread t2=new MyThread(obj, 100, "T2");
        MyThread t3=new MyThread(obj, 110, "T3");
        MyThread t4=new MyThread(obj, 130, "T4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
