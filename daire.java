import java.sql.SQLOutput;
import java.util.Scanner;

public class alan {
    public static void main(String[] args) {
        //formul r^2* pi* dilimin acısı(a)/360

        int r;
        double pi= 3.14;
        int a;
        Scanner gul= new Scanner(System.in);

        System.out.println("Yarı çapını giriniz:");
        r= gul.nextInt();

        System.out.println("Açısını giriniz:");
        a= gul.nextInt();
        double alan= ((r*r)*pi*a)/360;

          System.out.println("Dairenin alanı:"+ alan);


    }
}
