package ar.edu.udeci.pv.oop;

class Base{

    public static void display(){
        System.out.println("Static or class method from Base");
    }

    public void print(){
        System.out.println("Static or class method from Base");
    }
}

class Derived extends Base {

    public static void display(){
        System.out.println("Static or class method from Derived");
    }

    public void print(){
        System.out.println("Static or class method from Derived");
    }
}

public class TestOverriding {

    public static void main(String args[]){

        Base obj1 = new Derived();

        obj1.display();  // has private access

        obj1.print();

    }

}

