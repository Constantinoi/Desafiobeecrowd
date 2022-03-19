package iniciante;

import java.util.Arrays;
import java.util.Scanner;

public class BEE1042 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		String a = s.nextLine();

		String texto[] = a.split(" ");

		int ord[] = new int[texto.length];
		int nord[] = new int[texto.length];

		for (int i = 0; i < texto.length; i++) {
			ord[i] = Integer.parseInt(texto[i]);
			nord[i] = Integer.parseInt(texto[i]);
		}

		Arrays.sort(ord);
		for (int o : ord) {
			System.out.println(o);
		}
		System.out.println();
		for (int no : nord) {
			System.out.println(no);
		}

		s.close();
	}

}
