import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double r, a;

        Scanner sc = new Scanner(System.in);

        System.out.print("dairenin yarıçapını giriniz: ");
        r = sc.nextDouble();

        System.out.print("daire diliminin merkez açısını giriniz: ");
        a = sc.nextDouble();

        System.out.println("Yarıçapı " + r + ", merkez açısının ölçüsü " + a + " olan daire diliminin alanı: " + (3.14 * (r*r) * a) / 360);
    }
}