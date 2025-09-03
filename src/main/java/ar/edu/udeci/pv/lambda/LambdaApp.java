package ar.edu.udeci.pv.lambda;

@FunctionalInterface
interface Cab{
    void bookCab();
}

@FunctionalInterface
interface CabX{
    double bookCab(String source, String destination);
}

@FunctionalInterface
interface CabXY{
    double bookCab(String source, String destination, String category);
}

@FunctionalInterface
interface MyLambda{
    String test(String chars);
}

class UberX implements Cab{

    public void bookCab() {
        System.out.println("Bookec cab !!");
    }
}

public class LambdaApp {

    static int instantStaticVar = 100;

    public static void main(String argas[]) {


        int instanceVar = 10;

        //1.
        Cab cab = new UberX();
        cab.bookCab();

        //2.Annonymous class implementation
        Cab cab2 = new Cab() {

            public void bookCab() {
                System.out.println("Bookec cab !!" + "\r\n");
            }
        };


        //3. Using a lambda expression -> Funcional interface

        CabX cabX = (source, destination) -> {
            System.out.println("UberX Booked from " + source + " to " + destination + " !! Arriving as soon" + "\r\n");
            return 123.12;
        };

        double fare = cabX.bookCab("7 av", "springfild");
        System.out.println(" Fare are :" + fare + "\r\n");


        CabXY cabXY = (source, destination, category) -> {
            int localVariable = 250;
            System.out.println("UberXY Plus Booked from " + source + " to " + destination + " !! Arriving as soon");
            System.out.println(" Variable :" + instanceVar);
            System.out.println(" Static Variable :" + LambdaApp.instantStaticVar);
            System.out.println(" Local Variable :" + localVariable + "\r\n");
            return 246.12;
        };

        double fare2 = cabXY.bookCab("7 av", "springfild", "Plus");
        System.out.println(" Fare2 are :" + fare2 + "\r\n" + "\r\n");


        //Paramenters
        // 0 Paremeter
        /*() -> System.out.print(" ZERO Paramenter");


        (param) -> System.out.print(" One Paramenter");

        (p1, p2) ->  System.out.print(" Multiple Paramenter :" + p1 + " , " p2);
        */


        //Local variable
        String myStr = " Local paramenters";
        MyLambda dis = (chars) -> {
            return myStr + " : " + new String(chars);
        };

        String value = dis.test(" to Test !!!");
        System.out.println(value);
    }
}
