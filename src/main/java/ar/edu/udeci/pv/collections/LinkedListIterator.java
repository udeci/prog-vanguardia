package ar.edu.udeci.pv.collections;

import java.util.LinkedList;
import java.util.ListIterator;

class Student{
    private String name;
    private int id;
    Student(String name, int id){
        this.name=name;
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}

public class LinkedListIterator {
    public static void main(String[] args) {
        LinkedList<Student> lista = new LinkedList<Student>();
        lista.add(new Student("Juan", 85));
        lista.add(new Student("Maria", 45));
        lista.add(new Student("Pedro", 51));

        ListIterator<Student> iterador = lista.listIterator();

        while (iterador.hasNext()) {
            Student e = iterador.next();
            System.out.println(e.getName());
        }
        System.out.println("sigo con el mismo iterador");
        while (iterador.hasPrevious()) {
            Student e = iterador.previous();
            System.out.println(e.getName());
        }
    }
}



