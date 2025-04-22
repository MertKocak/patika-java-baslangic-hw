import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        * Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL*/

        double armut, elma, domates, muz, patlican;

        Scanner sc = new Scanner(System.in);

        System.out.print("Armut kaç kilo? : ");
        armut = sc.nextDouble();
        armut = armut * 2.14;

        System.out.print("Elma kaç kilo? : ");
        elma = sc.nextDouble();
        elma = elma * 3.67;

        System.out.print("Domates kaç kilo? : ");
        domates = sc.nextDouble();
        domates = domates * 1.11;

        System.out.print("Muz kaç kilo? : ");
        muz = sc.nextDouble();
        muz = muz * 0.95;

        System.out.print("Patlıcan kaç kilo? : ");
        patlican = sc.nextDouble();
        patlican = patlican * 5;

        System.out.println("Toplam tutar: " + (armut + elma + muz + domates + patlican));

    }
}