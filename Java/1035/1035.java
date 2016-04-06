import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A,B,C,D;
		Scanner scanner = new Scanner(System.in);
		
		A = scanner.nextInt();
		B = scanner.nextInt();
		C = scanner.nextInt();
		D = scanner.nextInt();
		
		if (B>C && D>A && (C+D)>(A+B) && C>=0 && D>=0 && A % 2 == 0)  {
			System.out.println("Valores aceitos");
		} else {
			System.out.println("Valores nao aceitos");
		}


		


	}

}
