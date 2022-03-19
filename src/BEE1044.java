import java.util.Scanner;

public class BEE1044 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();
		int m = 0;
		int n = 0;

		for (int i = 0;; i++) {
			m = a * i;
			if (m >= b) {
				break;
			}
		}
		for (int i = 0;; i++) {
			n = b * i;
			if (n >= a) {
				break;
			}
		}

		if ((m == n)) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}

		s.close();
	}

}
