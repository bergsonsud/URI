import java.io.IOException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		String name;
		double salary,total;
		Scanner scanner = new Scanner(System.in);
		
		name = scanner.nextLine();
		salary = scanner.nextDouble();
		total = scanner.nextDouble();
		
		System.out.printf("TOTAL = R$ %.2f\n",salary + (total*0.15));
		

	}

}
