import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double fiyat;

        Scanner sc = new Scanner(System.in);

        System.out.println("Fiyatı giriniz: ");
        fiyat = sc.nextDouble();

        System.out.println("KDV'li fiyat: " + (fiyat + (fiyat * 18 / 100)));
        System.out.println("KDV miktarı: " + (fiyat * 18 / 100));

    }
}