package iniciante;

import java.util.Scanner;

public class BEE1043 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		float a = s.nextFloat();
		float b = s.nextFloat();
		float c = s.nextFloat();

		if (a < b + c && b < a + c && c < a + b) {
			System.out.printf("Perimetro = %.1f\n", a + b + c);
		} else {
			System.out.printf("Area = %.1f\n", ((a + b) * c) / 2);
		}

		s.close();
	}
}
