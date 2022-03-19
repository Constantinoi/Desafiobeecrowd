package iniciante;
import java.util.Scanner;

public class BEE1040 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		float n1 = s.nextFloat();
		float n2 = s.nextFloat();
		float n3 = s.nextFloat();
		float n4 = s.nextFloat();

		float m = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / (2 + 3 + 4 + 1);

		System.out.printf("Media: %.1f\n", m);
		if (m >= 7) {
			System.out.println("Aluno aprovado.");
		} else if (m >= 5.0 && m <= 6.9) {
			System.out.println("Aluno em exame.");
			float e = s.nextFloat();
			System.out.printf("Nota do exame: %.1f\n", e);
			e = (e + m) / 2;
			if (e >= 5) {
				System.out.println("Aluno aprovado.");
			} else {
				System.out.println("Aluno reprovado.");
			}
			System.out.printf("Media final: %.1f\n", e);

		} else {
			System.out.println("Aluno reprovado.");
		}

		s.close();
	}

}
