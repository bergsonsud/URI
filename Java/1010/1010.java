import java.io.IOException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		int cod,pecas;
		double value,total = 0;
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i <2; i++) {
			
			cod = scanner.nextInt();
			pecas = scanner.nextInt();
			value = scanner.nextDouble();
			
			total = total+(value*pecas);
		}
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n",total);
		

	}

}
