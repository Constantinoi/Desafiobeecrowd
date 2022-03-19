package iniciante;
import java.util.Scanner;

public class URI1036 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		double a = s.nextDouble();
		double b = s.nextDouble();
		double c = s.nextDouble();

		double raiz = Math.pow(b, 2) - (4 * a * c);

		double x1 = (-b + Math.sqrt(raiz)) / (2 * a);

		double x2 = (-b - Math.sqrt(raiz)) / (2 * a);

		if (raiz < 0 || a == 0) {
			System.out.println("Impossivel calcular");
		} else {
			System.out.printf("R1 = %.5f\n", x1);
			System.out.printf("R2 = %.5f\n", x2);
		}

		s.close();
	}
}
