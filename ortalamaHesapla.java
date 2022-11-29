[Patika.dev](https://www.patika.dev/tr) 

import java.util.Scanner;
public class Ortalama{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz:");
        double math=input.nextDouble();

        System.out.print("Fizik Notunuz:");
        double physic=input.nextDouble();

        System.out.print("Kimya Notunuz:");
        double chemistry=input.nextDouble();

        System.out.print("Türkçe Notunuz:");
        double turkish= input.nextDouble();

        System.out.print("Tarih Notunuz:");
        double history= input.nextDouble();

        System.out.print("Müzik Notunuz:");
        double music = input.nextDouble();

        double ortalama= (math+physic+chemistry+turkish+history+music)/6 ;
        System.out.println("Genel Not Ortalamanız:"+ortalama);

        boolean sonuc= ortalama>=60;
        String str = sonuc ? "Sınıfı Geçtiniz." : "Sınıfta Kaldınız.";
        System.out.print(str);
    }
}
