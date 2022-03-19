import java.util.Scanner;

public class BEE1045 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		float a = s.nextFloat();
		float b = s.nextFloat();
		float c = s.nextFloat();

		if (a >= b + c) {
			System.out.println("NAO FORMA TRIANGULO");
		}
		if (Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) {
			System.out.println("TRIANGULO RETANGULO");
		}

		if (Math.pow(a, 2) > Math.pow(b, 2) + Math.pow(c, 2)) {
			System.out.println("TRIANGULO OBTUSANGULO");
		}

		if (Math.pow(a, 2) < Math.pow(b, 2) + Math.pow(c, 2)) {
			System.out.println("TRIANGULO ACUTANGULO");
		}
		if (a == b && b == c) {
			System.out.println("TRIANGULO EQUILATERO");
		}

		if ((a == b) || (b == c) || (a == c)) {
			System.out.println("TRIANGULO ISOSCELES");
		}

		s.close();

	}

}
