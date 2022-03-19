import java.util.Scanner;

public class URI1012 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		final double PI = 3.14159; 
        
        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();
        
        
        System.out.printf("TRIANGULO: %.3f\n",(a*c)/2);
        System.out.printf("CIRCULO: %.3f\n",PI*Math.pow(c, 2));
        System.out.printf("TRAPEZIO: %.3f\n",((a+b)*c)/2);
        System.out.printf("QUADRADO: %.3f\n",Math.pow(b, 2));
        System.out.printf("RETANGULO: %.3f\n",a*b);
        
        s.close();
	}
}
