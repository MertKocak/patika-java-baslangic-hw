import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int sum = 0;

        do {
            System.out.print("Bir sayı girin: ");
            number = input.nextInt();

            // Hem çift hem 4'ün katı mı?
            if (number % 2 == 0 && number % 4 == 0) {
                sum += number;
            }

        } while (number % 2 == 0); // Tek sayı girilene kadar devam

        System.out.println("Çift ve 4'ün katı olan sayıların toplamı: " + sum);
    }
}
