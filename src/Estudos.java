import java.util.Scanner;

public class Estudos {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();

		int r = (a + b + (Math.abs(a - b))) / 2;

		r = (r + c + (Math.abs(r - c))) / 2;

		System.out.printf("%d eh o maior\n", r);

		s.close();
	}

}
