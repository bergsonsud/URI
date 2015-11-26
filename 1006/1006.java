import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double A,B,C;
		Scanner scanner = new Scanner(System.in);
		A = scanner.nextDouble();
		B = scanner.nextDouble();
		C = scanner.nextDouble();
		
		System.out.printf("MEDIA = %.1f\n", ((A*2)+(B*3)+(C*5))/10);

	}

}
