import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int segundos,h,m,s;
		Scanner scanner = new Scanner(System.in);

		segundos = scanner.nextInt();

		h = segundos / 3600;
		m = (segundos % 3600) / 60;
		s = (segundos % 3600) % 60;
		System.out.println(h + ":" + m + ":" + s);
		


	}

}
