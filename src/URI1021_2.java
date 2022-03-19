import java.util.Scanner;

public class URI1021_2 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		float n = s.nextFloat();

		float notas[] = { 100, 50, 20, 10, 5, 2 };
		float moedas[] = { 100, 50, 25, 10, 5, 1 };

		for (int i = 0; i < notas.length; i++) {
			if (notas[i] == 100) {
				System.out.println("NOTAS:");
			}
			System.out.printf("%d nota(s) de R$ %.2f\n", (int) ((int) n / notas[i]), notas[i]);
			n %= notas[i];
		}
		
		n = (float) Math.round(n * 100);
		
		for (int i = 0; i < moedas.length; i++) {
			if (moedas[i] == 100) {
				System.out.println("MOEDAS:");
			}
			System.out.printf("%d moeda(s) de R$ %.2f\n", (int) ((int) n / moedas[i]), moedas[i]/100);
			n %= moedas[i];
		}

		s.close();
	}
}
