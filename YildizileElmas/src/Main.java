import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Elmas yüksekliği (pozitif bir sayı) girin: ");
        int n = input.nextInt();

        // Üst üçgen
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" "); // Boşluk
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*"); // Yıldız
            }
            System.out.println();
        }

        // Alt üçgen
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" "); // Boşluk
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*"); // Yıldız
            }
            System.out.println();
        }
    }
}
