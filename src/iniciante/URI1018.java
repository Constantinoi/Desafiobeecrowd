package iniciante;
import java.util.Scanner;

public class URI1018 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int[] notas = { 100, 50, 20, 10, 5, 2, 1 };

		int n = s.nextInt();

		for (int i = 0; i < notas.length; i++) {

			System.out.printf("%d nota(s) de R$ %.2f\n", (n / notas[i]), (float) notas[i]);
			n = n % notas[i];
		}
		s.close();
	}

}
