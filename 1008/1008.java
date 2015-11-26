import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		double worked,value_hour;
		Scanner scanner = new Scanner(System.in);
		num = scanner.nextInt();
		worked = scanner.nextDouble();
		value_hour = scanner.nextDouble();
		
		
		
		System.out.printf("NUMBER = %d\n",num);
		System.out.printf("SALARY = U$ %.2f\n",value_hour*worked);

	}

}
