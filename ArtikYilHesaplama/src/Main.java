import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Yıl giriniz: ");
        int yil = input.nextInt();

        boolean artikYilMi;

        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0) {
                    artikYilMi = true;
                } else {
                    artikYilMi = false;
                }
            } else {
                artikYilMi = true;
            }
        } else {
            artikYilMi = false;
        }

        if (artikYilMi) {
            System.out.println(yil + " bir artık yıldır.");
        } else {
            System.out.println(yil + " bir artık yıl değildir.");
        }

    }
}