package iniciante;
import java.util.Scanner;

public class URI1017 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int t = s.nextInt();
		int vm = s.nextInt();
		
		float l = vm*t;
		
		System.out.printf("%.3f\n", l/12);

		s.close();
	}
}
