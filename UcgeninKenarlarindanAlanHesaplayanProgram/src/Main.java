import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double kenar1, kenar2, kenar3, alan = 0, u = 0;


        Scanner sc = new Scanner(System.in);

        System.out.print("birinci kenarı giriniz: ");
        kenar1 = sc.nextDouble();

        System.out.print("ikinci kenarı giriniz: ");
        kenar2 = sc.nextDouble();

        System.out.print("üçüncü kenarı giriniz: ");
        kenar3 = sc.nextDouble();

        u = (kenar1 + kenar2 + kenar3) / 2 ;

        alan = Math.sqrt(u * (u-kenar1) * (u-kenar2) * (u-kenar3));

        System.out.print("üçgenin alanı: " + alan );

    }
}