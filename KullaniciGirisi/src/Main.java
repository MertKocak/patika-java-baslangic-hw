import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, password, newPass;

        Scanner sc = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        userName = sc.nextLine();

        System.out.print("Şifreniz :");
        password = sc.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız!");

        } else if (userName.equals("patika") && password != "java123"){
            System.out.println("Şifreniz yanlış! Şifrenizi sıfırlamak ister misiniz! 1-EVET 2-HAYIR");
            int passreset = sc.nextInt();

            if(passreset == 1){
                Scanner sc2 = new Scanner(System.in);
                System.out.print("Şifreniz :");
                newPass = sc2.nextLine();

                if(newPass.equals("java123")){
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                }
                else {
                    System.out.println("Şifre oluşturuldu");
                }
            }
            else if(passreset == 2){

            }
        } else {
            System.out.println("Bilgileriniz Yanlış !");
        }

    }
}