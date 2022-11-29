import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double a,b,c;
		
		System.out.print("Lütfen 1.Kenarı girin: ");
		a = scanner.nextDouble();
		
		System.out.print("Lütfen 2.Kenarı girin: ");
		b = scanner.nextDouble();
		
		c = Math.sqrt((a*a) + (b*b));
		System.out.println("Hipotenüs: " + c);
		
	}
}
