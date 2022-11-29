import java.util.Scanner;

public class manavprogrami {
    public static void main(String[] args){
        double apple,aprice,banana,bprice,pear,pprice,tomato,tprice,eggplant,eprice,toplam;

        Scanner input=new Scanner(System.in);
        System.out.print("Kaç Kilo Armut Aldınız:");
        pear=input.nextDouble();
        pprice=pear*2.14;
        System.out.print("Kaç Kilo Elma Aldınız:");
        apple=input.nextDouble();
        aprice=apple*3.67;
        System.out.print("Kaç Kilo Domates Aldınız:");
        tomato=input.nextDouble();
        tprice=tomato*1.11;
        System.out.print("Kaç Kilo Muz Aldınız:");
        banana=input.nextDouble();
        bprice=banana*0.95;
        System.out.print("Kaç Kilo Patlıcan Aldınız:");
        eggplant = input.nextDouble();
        eprice=eggplant*5;
        toplam=pprice+aprice+tprice+bprice+eprice;
        System.out.print("Toplam Tutar:"+toplam);

    }

}
