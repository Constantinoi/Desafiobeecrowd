import java.util.Scanner;

public class URI10182 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();

		System.out.printf("%d nota(s) de R$ 100,00\n", n / 100);
		n = n % 100;
		System.out.printf("%d nota(s) de R$ 50,00\n", n / 50);
		n = n % 50;
		System.out.printf("%d nota(s) de R$ 20,00\n", n / 20);
		n = n % 20;
		System.out.printf("%d nota(s) de R$ 10,00\n", n / 10);
		n = n % 10;
		System.out.printf("%d nota(s) de R$ 5,00\n", n / 5);
		n = n % 5;
		System.out.printf("%d nota(s) de R$ 2,00\n", n / 2);
		n = n % 2;
		System.out.printf("%d nota(s) de R$ 1,00\n", n / 1);

		s.close();
	}

}
