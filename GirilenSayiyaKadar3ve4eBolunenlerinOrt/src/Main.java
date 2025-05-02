import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sayi = 0, toplam = 0, counter = 0;
        double ort = 0.0;

        System.out.print("Sayı girin: ");
        sayi = sc.nextInt();

        for(int i = 1 ; i < sayi ; i++){
            if(i%3 == 0 && i%4 == 0){
                toplam = toplam + i;
                counter++;
            }
        }

        ort = toplam / counter;

        System.out.print("0'dan " + sayi + " sayısına kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalaması: " + ort);

    }
}