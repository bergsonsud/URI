import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double A,B;
		Scanner scanner = new Scanner(System.in);
		A = scanner.nextDouble();
		B = scanner.nextDouble();
		
		System.out.printf("MEDIA = %.5f\n", ((A*3.5)+(B*7.5))/11);

	}

}
