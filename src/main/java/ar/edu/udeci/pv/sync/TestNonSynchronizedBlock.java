package ar.edu.udeci.pv.sync;

class TableExample{
    void printTable(int n, String nm){
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

class MyThreadExample extends Thread{

    TableExample table;
    int value;
    String name;

    MyThreadExample(TableExample table, int value, String name){
        this.table = table;
        this.name = name;
        this.value = value;
    }
    public void run(){
        table.printTable(value, name);
        System.out.println("End " + name + " \r\n");
    }


}

public class TestNonSynchronizedBlock{

    public static void main(String args[]) throws InterruptedException {
        TableExample obj = new TableExample();//only one object
        MyThreadExample t1=new MyThreadExample(obj, 5, "T1");
        MyThreadExample t2=new MyThreadExample(obj, 100, "T2");
        MyThreadExample t3=new MyThreadExample(obj, 110, "T3");
        MyThreadExample t4=new MyThreadExample(obj, 130, "T4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
