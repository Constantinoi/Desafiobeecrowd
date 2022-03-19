import java.util.Scanner;

public class URI1021 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		double valores[] = { 100, 50, 20, 10, 5, 2, 1, 0.5, 0.25, 0.10, 0.05, 0.01 };
		float n = s.nextFloat();

		for (int i = 0; i < valores.length; i++) {

			if (valores[i] == 100f) {
				System.out.println("NOTAS:");
			} else if (valores[i] == 1f) {
				System.out.println("MOEDAS:");
			}
			
			int notas = (int) (n / valores[i]);
				System.out.printf("%d nota(s) de R$ %.2f\n",Math.round(notas), valores[i]);
			n %= valores[i];
		}

		s.close();
	}

}
