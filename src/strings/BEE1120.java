package strings;

import java.util.Scanner;

public class BEE1120 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String a;
		do {
			a = s.next();
			String b = s.next();
			String r = b.replace(a, "").replaceFirst("0*", "");
			if (!r.isEmpty()) {
				System.out.println(r);
			} else if (a.equals("0")|| b.contains("0")) {
				System.out.println("0");
			}

		} while (!a.equals("0"));
		s.close();
	}
}
