import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int idade,a,m,d;
		Scanner scanner = new Scanner(System.in);

		idade = scanner.nextInt();

		a = idade / 365;
		m = (idade % 365) / 30;
		d = (idade % 365) % 30;
		System.out.printf("%d ano(s)\n",a);
		System.out.printf("%d mes(es)\n",m);
		System.out.printf("%d dia(s)\n",d);


	}

}
