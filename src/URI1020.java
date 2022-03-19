import java.util.Scanner;

public class URI1020 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int d = s.nextInt();

		int a = d / 365;
		d %= 365;
		int m = d / 30;
		d %= 30;

		System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", a, m, d);

		s.close();
	}
}
