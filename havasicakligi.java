import java.util.Scanner;

public class HavaSicakligi {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int temp;
		
		System.out.print("Sıcaklık giriniz : ");
		temp = scanner.nextInt();
		
		if (temp < 5) {
			System.out.println("Kayak yapabilirsiniz");
		}
		else if (temp > 5 && temp <= 15) {
			System.out.println("Sinemaya gidebilirsiniz");
		}
		else if (temp > 15 && temp <= 25) {
			System.out.println("Pikniğe gidebilirsiniz");
		}
		else if (temp > 25) {
			System.out.println("Yüzmeye gidebilirsiniz");
		}
		
		scanner.close();

	}

}
