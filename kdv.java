import java. util.Scanner;
public class kdv {
    public static void main(String[] args) {
        double kitap;
        double kdvOran =0.18;
        double kdvOran2= 0.8;

        Scanner input = new Scanner(System.in);
        System.out.println("Tutar");
        kitap= input.nextDouble();

        double kdvTutar= kitap*kdvOran;

        kdvTutar= kitap>0 && kitap<1000? kitap*kdvOran:kitap*kdvOran2;
        double kvdliTutar = kitap+=kdvTutar;
        System.out.println(kvdliTutar);







    }
}
