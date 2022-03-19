import java.util.Scanner;

public class URI1015 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String x = s.nextLine();
		String y = s.nextLine();

		String[] x1 = x.split(" ");
		String[] y1 = y.split(" ");

		double x2 = Math.pow((Double.parseDouble(y1[0]) - Double.parseDouble(x1[0])), 2);

		double y2 = Math.pow((Double.parseDouble(x1[1]) - Double.parseDouble(y1[1])), 2);

		System.out.printf("%.4f\n", Math.sqrt(x2 + y2));

		s.close();
	}
}
