import java.util.Scanner;

public class URI1014 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int x = s.nextInt();
		float y = s.nextFloat();

		System.out.printf(" %.3f km/l\n", x / y);

		s.close();
	}

}
