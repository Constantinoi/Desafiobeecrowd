import java.util.Scanner;

public class URI1019 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int h = n / 3600;
		n = n % 3600;
		int mm = n / 60;
		n = n % 60;

		System.out.printf("%d:%d:%d", h, mm, n);
	}
}
