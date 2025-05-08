import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int n = input.nextInt();

        double harmonic = 0.0;

        for (int i = 1; i <= n; i++) {
            harmonic += 1.0 / i;
        }

        System.out.println("Harmonik seri sonucu: " + harmonic);
    }
}
