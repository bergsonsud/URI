import java.io.IOException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		double area,raio;
		double pi = 3.14159;
		

		raio = scanner.nextDouble();		
		area = pi*(raio*raio);
	
		
		System.out.printf("A=%.4f\n",area);

	}

}
