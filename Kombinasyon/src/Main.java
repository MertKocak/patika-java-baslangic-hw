import java.util.Scanner;

public class Main {
    // Faktöriyel hesaplayan yardımcı metod
    public static int factorial(int num) {
        int result = 1;
        for (int i = 2; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("n değerini girin: ");
        int n = input.nextInt();

        System.out.print("r değerini girin: ");
        int r = input.nextInt();

        if (n >= r && n >= 0 && r >= 0) {
            int combination = factorial(n) / (factorial(r) * factorial(n - r));
            System.out.println("C(" + n + ", " + r + ") = " + combination);
        } else {
            System.out.println("Geçersiz giriş! n >= r ve ikisi de pozitif olmalıdır.");
        }
    }
}
