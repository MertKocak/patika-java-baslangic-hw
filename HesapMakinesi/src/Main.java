import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double sayi1=0;
        double sayi2=0;
        int islem = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("birinci sayıyı giriniz: ");
        sayi1 = sc.nextDouble();

        System.out.print("ikinci sayıyı giriniz: ");
        sayi2 = sc.nextDouble();

        System.out.println("1-toplama, 2-çıkarma, 3-çarpma, 4-bölme • işlemi seçiniz: ");
        islem = sc.nextInt();

        if(islem == 1){
            System.out.println("sonuc: " + (sayi1 + sayi2));
        }
        else if(islem == 2){
            System.out.println("sonuc: " + (sayi1 - sayi2));
        }
        else if(islem == 3){
            System.out.println("sonuc: " + (sayi1 * sayi2));
        }
        else if(islem == 4){
            if(sayi2 != 0){
                System.out.println("sonuc: " + (sayi1 / sayi2));
            }
            else{
                System.out.println("bir sayı 0'a bölünemez!");
            }
        } else {
            System.out.println("yanlış seçim yaptınız");
        }



    }
}