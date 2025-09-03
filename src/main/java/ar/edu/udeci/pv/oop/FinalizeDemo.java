package ar.edu.udeci.pv.oop;

class FinalizeTestDemo {

    @Override
    protected void finalize() throws Throwable {
        System.out.println(" Pass before Finalize");
    }

}

public class FinalizeDemo {

    public static void main(String[] args){

        FinalizeTestDemo ob = new FinalizeTestDemo();

        ob = null;

        System.gc();
    }
}



