package ar.edu.udeci.pv.lambda;

@FunctionalInterface
interface Calculator{
    void add(int n1, int n2);
}

class Calc{

    public static void addSomething(int n1, int n2){
        System.out.println(n1 + " add "+ n2 +" = " + (n1+n2));
    }

    public void letsSomething(int n1, int n2){
        System.out.println(n1 + " add "+ n2 +" = " + (n1+n2));
    }
}

public class MethodReferenceApp {

    public static void main(String args[]){

        Calc.addSomething( 1, 7);

        // 1. Refering to a static Method
        Calculator cRef = Calc::addSomething; //Method reference
        cRef.add(9,12);

        // 2. Refering to a NON static Method
        Calc calc2 = new Calc();
        Calculator cRef2 = calc2::letsSomething; //Method reference
        cRef2.add(7,32);
    }

}
