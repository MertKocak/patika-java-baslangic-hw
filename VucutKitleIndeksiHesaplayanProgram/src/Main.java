import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double boy = 0, kilo = 0;

        Scanner sc = new Scanner(System.in);

        System.out.print("Boyunuz (m): ");
        boy = sc.nextDouble();

        System.out.print("Kilonuz (kg): ");
        kilo = sc.nextDouble();

        double index = kilo / (boy * boy);

        System.out.println("Vücut Kitle İndeksiniz: " + index);

    }
}