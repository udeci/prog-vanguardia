package ar.edu.udeci.pv.sync;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Resolución del punto 6 parcial 18-05-2019
 */

class TableElect{

    private int mesa;

    private long dni;

    public TableElect(int mesa, long dni) {
        this.mesa = mesa;
        this.dni = dni;
    }

    public long getDni() {
        return dni;
    }

    public int getMesa(){
        return mesa;
    }
}

class TableList{

    private List<TableElect> list;

    public TableList(List<TableElect> list) {
        this.list = list;
    }

    public List<TableElect> getDataToPrint(int nmesa, String nm) {
        List<TableElect> collected = new ArrayList();
        synchronized (this) {//synchronized block
            Iterator i = list.iterator();
            while (i.hasNext()) {
                TableElect tableElect = (TableElect) i.next();
                if (tableElect.getMesa() == nmesa) {
                    collected.add(tableElect);
                }
            }
            list.removeAll(collected);
        }//end of the method syncronized
        return collected;
    }

}

class MyThreadEx extends Thread {

    TableList table;
    int value;
    String name;

    MyThreadEx(TableList table, int value, String name) {
        this.table = table;
        this.name = name;
        this.value = value;
    }

    public void run() {
        List<TableElect> result = table.getDataToPrint(value, name);
        System.out.println("End " + name + " \r\n");
        result.stream().forEach(c-> System.out.println(c.getDni()));
    }
}

public class PrintSynchronized {

    public static void main(String args[]){

        List<TableElect> list = new ArrayList();
        list.add(new TableElect(123, 34321234L));
        list.add(new TableElect(127, 34526234L));
        list.add(new TableElect(121, 24321234L));
        list.add(new TableElect(123, 24321234L));
        list.add(new TableElect(123, 39321234L));
        list.add(new TableElect(127, 14526234L));

        TableList obj = new TableList(list);//only one object
        MyThreadEx t1 = new MyThreadEx( obj, 123, "Bob");
        MyThreadEx t2 = new MyThreadEx( obj, 123, "Alice");
        MyThreadEx t3 = new MyThreadEx( obj, 127, "George");
        MyThreadEx t4 = new MyThreadEx( obj, 123, "Glen");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}