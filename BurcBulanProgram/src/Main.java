import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ay,gun;

        Scanner sc = new Scanner(System.in);

        System.out.println("1- Ocak\n2- Şubat\n3- Mart\n4- Nisan\n5- Mayıs\n6- Haziran\n7- Temmuz\n8- Ağustos\n9- Eylül\n10- Ekim\n11- Kasım\n12- Aralık");
        System.out.print("Doğduğunuz Ayı Girin (sayı) : ");
        ay = sc.nextInt();

        while (ay > 12 || ay < 1) {
            System.out.print("Hatalı Seçim. Lütfen Tekrar Deneyin... : ");
            ay = sc.nextInt();
        }

        if (ay == 1 || ay == 3 || ay == 5 || ay == 7 || ay == 8 || ay == 10 || ay == 12 ){
            System.out.print("Doğduğunuz Günü Girin : ");
            gun = sc.nextInt();
            while (gun < 1 || gun > 31) {
                System.out.print("Hatalı Seçim. Lütfen Tekrar Deneyin... : ");
                gun = sc.nextInt();
            }
        }else if(ay == 4 || ay == 6 || ay == 9 || ay == 11 ){
            System.out.print("Doğduğunuz Günü Girin : ");
            gun = sc.nextInt();
            while (gun < 1 || gun > 30) {
                System.out.print("Hatalı Seçim. Lütfen Tekrar Deneyin... : ");
                gun = sc.nextInt();
            }
        }else{
            System.out.print("Doğduğunuz Günü Girin : ");
            gun = sc.nextInt();
            while (gun < 1 || gun > 29) {
                System.out.print("Hatalı Seçim. Lütfen Tekrar Deneyin... : ");
                gun = sc.nextInt();
            }
        }

        if (ay == 1){
            if (gun >= 22 ){
                System.out.println("Kova");
            }else{
                System.out.println("Oğlak");
            }
        }else if (ay == 2){
            if (gun >= 20){
                System.out.println("Balık");
            }else{
                System.out.println("Kova");
            }
        }else if (ay == 3){
            if (gun >= 21){
                System.out.println("Koç");
            }else{
                System.out.println("Balık");
            }
        }else if (ay == 4){
            if (gun >= 21){
                System.out.println("Boğa");
            }else{
                System.out.println("Koç");
            }
        }else if (ay == 5){
            if (gun >= 22){
                System.out.println("İkizler");
            }else{
                System.out.println("Boğa");
            }
        }else if (ay == 6){
            if (gun >= 23){
                System.out.println("Yengeç");
            }else{
                System.out.println("İkizler");
            }
        }else if (ay == 7){
            if (gun >= 23){
                System.out.println("Aslan");
            }else{
                System.out.println("Yengeç");
            }
        }else if (ay == 8){
            if (gun >= 23){
                System.out.println("Başak");
            }else{
                System.out.println("Aslan");
            }
        }else if (ay == 9){
            if (gun >= 23){
                System.out.println("Terazi");
            }else{
                System.out.println("Başak");
            }
        }else if (ay == 10){
            if (gun >= 23){
                System.out.println("Akrep");
            }else{
                System.out.println("Terazi");
            }
        }else if (ay == 11){
            if (gun >= 22){
                System.out.println("Yay");
            }else{
                System.out.println("Akrep");
            }
        }else {
            if (gun >= 22){
                System.out.println("Oğlak");
            }else{
                System.out.println("Yay");
            }
        }
    }
}