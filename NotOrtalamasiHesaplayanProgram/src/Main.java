import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Değişkenleri oluştur
        int mat, fizik, kimya, turkce, tarih, muzik;

        Scanner sc = new Scanner(System.in);

        System.out.println("matematik notunuzu giriniz: ");
        mat = sc.nextInt();

        System.out.println("fizik notunuzu giriniz: ");
        fizik = sc.nextInt();

        System.out.println("kimya notunuzu giriniz: ");
        kimya = sc.nextInt();

        System.out.println("turkce notunuzu giriniz: ");
        turkce = sc.nextInt();

        System.out.println("tarih notunuzu giriniz: ");
        tarih = sc.nextInt();

        System.out.println("muzik notunuzu giriniz: ");
        muzik = sc.nextInt();

        double ort = (mat + fizik + kimya + turkce + tarih + muzik) / 6;

        if (ort >= 50) {
            System.out.println("ortalamanız: " + ort + " tebrikler geçtiniz");
        } else {
            System.out.println("ortalamanız: " + ort + " maalesef kaldınız");
        }
    }
}