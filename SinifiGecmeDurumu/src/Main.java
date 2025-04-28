import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, fizik, turkce, kimya, muzik;
        int total=0,count=0;
        int min=55;
        double average = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();
        System.out.print("Türkçe notunuz: ");
        turkce = input.nextInt();
        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();
        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();
        System.out.print("Müzik notunuz: ");
        muzik = input.nextInt();

        if(mat>=0 && mat<=100){
            total=total+mat;
            count+=1;
        }
        if(fizik>=0 && fizik<=100){
            total=total+fizik;
            count+=1;
        }
        if(turkce>=0 && turkce<=100){
            total=total+turkce;
            count+=1;
        }
        if(kimya>=0 && kimya<=100){
            total=total+kimya;
            count+=1;
        }
        if(muzik>=0 && muzik<=100){
            total=total+muzik;
            count+=1;
        }
        average=total/(double)count;
        if(average>=min){
            System.out.println("Your score is "+average+" You passed'");
        }
        else{
            System.out.println("Your score is "+average+" Failed");
        }
    }
}