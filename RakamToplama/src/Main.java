import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int number = input.nextInt();

        int sum = 0;

        while (number != 0) {
            sum += number % 10;     // Son basamağı ekle
            number /= 10;           // Sayıyı bir basamak küçült
        }

        System.out.println("Basamaklar toplamı: " + sum);
    }
}
