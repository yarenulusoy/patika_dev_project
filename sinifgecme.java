import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, turkce, fizik, kimya, muzik;

        Scanner input = new Scanner(System.in);

        System.out.print( "Matematik Notunuz:");
        mat = input.nextInt();
        if ((mat >100)  || (mat <0 )) {
            mat = 0;
        }

        System.out.print( "Türkçe Notunuz:");
        turkce = input.nextInt();
        if ((turkce < 0) || (turkce > 100)) {
            turkce = 0;
        }

        System.out.print( "Fizik Notunuz:");
        fizik = input.nextInt();
        if ((fizik < 0) || (fizik > 100)) {
            fizik = 0;
        }

        System.out.print( "Kimya Notunuz:");
        kimya = input.nextInt();
        if ((kimya < 0) || (kimya > 100)) {
            kimya = 0;
        }

        System.out.print( "Müzik Notunuz:");
        muzik = input.nextInt();
        if ((muzik < 0) || (muzik > 100)) {
            muzik = 0;
        }

        double avarage = (mat + fizik + kimya + turkce + muzik) / 5;

        System.out.println("Ortalamanız: " + avarage);

        //String sonuc = avarage <= 55 ? "Sınıfta Kaldınız. Seneye tekrar görüşmek üzere!" : "Sınıfı geçtiniz. Tebrikler!";
        //System.out.println(sonuc);

if (avarage <= 55) {
    System.out.println("Sınıfta Kaldınız. Seneye tekrar görüşmek üzere!");
} else{
    System.out.println( "Sınıfı geçtiniz. Tebrikler!");
}

    }
}
