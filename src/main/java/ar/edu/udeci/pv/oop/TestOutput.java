package ar.edu.udeci.pv.oop;

import java.util.Scanner;

class Parent{

    public static void foo(){
        System.out.println("I am foo in Parent");
    }

    public void bar(){
        System.out.println("I am bar in Parent");
    }
}

class Child extends Parent{

    public static void foo(){
        System.out.println("I am foo in Child");
    }

    public void bar(){
        System.out.println("I am bar in Child");
    }
}

public class TestOutput {

    public static void main(String args[]){

        Parent obj1 = new Child();
        Child obj2 = new Child();


        obj1.foo();
        obj2.foo();

        obj1.bar();
        obj2.bar();

        Parent.foo();
        Child.foo();


        System.out.println("salida");
        System.err.println("Error de salida");

        Scanner scanner = new Scanner(System.in);
        String read = scanner.nextLine();
        System.out.println(read);
    }

}
