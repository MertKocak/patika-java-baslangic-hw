import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double km, yas, toplam = 0;
        int tip;

        Scanner sc = new Scanner(System.in);

        System.out.print("Gideceğiniz mesafeyi giriniz: (km): ");
        km = sc.nextInt();

        System.out.print( km >= 0 ? "yaşınızı giriniz: " : "Hatalı veri girdiniz!");
        yas = sc.nextInt();

        System.out.print( yas >= 0 ? "yolculuk türünü seçiniz 1-tek yön 2-gidiş dönüş: " : "Hatalı veri girdiniz!");
        tip = sc.nextInt();

        if(tip == 1 || tip == 2){
            toplam = km * 0.10;
            if(yas < 12 ){
                toplam = toplam / 2;
                if(tip == 2){
                    toplam = (toplam * 8) / 10;
                    toplam = toplam * 2;
                }
            }
            else if(yas < 24 && yas >= 12 ){
                toplam = (toplam * 9) / 10;
                if(tip == 2){
                    toplam = (toplam * 8) / 10;
                    toplam = toplam * 2;
                }
            }
            else if(yas > 65 ){
                toplam = (toplam * 7) / 10;
                if(tip == 2){
                    toplam = (toplam * 8) / 10;
                    toplam = toplam * 2;
                }
            }
        } else {
            System.out.println("Hatalı veri girdiniz!");
        }

        System.out.println("Toplam Tutar: " + toplam);

    }
}