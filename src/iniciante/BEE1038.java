package iniciante;
import java.util.Scanner;

public class BEE1038 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int cod = s.nextInt();
		int qnt = s.nextInt();
		double total = 0.0;

		switch (cod) {
		case 1:
			total = qnt * 4.00;
			break;
		case 2:
			total = qnt * 4.50;
			break;
		case 3:
			total = qnt * 5.00;
			break;
		case 4:
			total = qnt * 2.00;
			break;
		case 5:
			total = qnt * 1.50;
			break;
		}

		System.out.printf("Total: R$ %.2f\n", total);

		s.close();
	}
}
