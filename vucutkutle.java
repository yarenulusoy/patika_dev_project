import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

   
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu giriniz = " + " m " );
        double boy = scanner.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz = " + " kg ");
        double kilo = scanner.nextDouble();
        double VKI = kilo / (boy * boy);

        System.out.println("Vücut Kütle İndeksiniz = " + VKI);
    }
}
