import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double km, tutar;

        Scanner sc = new Scanner(System.in);

        System.out.print("gidilen mesafeyi km olarak yazın: ");
        km = sc.nextDouble();

        tutar = (km * 2.2) + 10 ;

        if(  tutar<20){
            System.out.println("ödenecek tutar: ossuruk20.0");
        } else if( tutar >= 20){
            System.out.println("ödenecek tutar: " + tutar);
        }
    }
}