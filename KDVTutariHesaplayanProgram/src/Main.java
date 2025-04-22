import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double fiyat, kdvoran = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Fiyatı giriniz: ");
        fiyat = sc.nextDouble();

        if (fiyat <= 1000 && fiyat > 0) {
            kdvoran = 0.18;
        } else if (fiyat > 1000) {
            kdvoran = 0.08;
        } else {
            System.out.println("Girdiğiniz değer hatalı.");
        }

        System.out.println("KDV'li fiyat: " + (fiyat + (fiyat * kdvoran)));
        System.out.println("KDV miktarı: " + kdvoran);

    }
}
