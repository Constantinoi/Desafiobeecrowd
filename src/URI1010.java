import java.util.Scanner;

public class URI1010 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String a = s.nextLine();
		String b = s.nextLine();

		String[] a2 = a.split(" ");
		String[] b2 = b.split(" ");

		double resultado1 = Integer.parseInt(a2[1]) * Double.parseDouble(a2[2]);
		double resultado2 = Integer.parseInt(b2[1]) * Double.parseDouble(b2[2]);

		System.out.printf("VALOR A PAGAR: R$ %.2f\n", resultado1 + resultado2);
		
		s.close();
	}
}
