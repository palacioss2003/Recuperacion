import java.util.Scanner;

public class Cadenas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int resultado = 0;
		System.out.println("Introduce una palabra:");
		String palabra_1 = sc.next();
		for (int i = 0; i < palabra_1.length(); i++) {
			if (palabra_1.substring(i, i + 1).equals("a")) {
				resultado++;
				System.out.println(resultado);	
				
			}
		}
		System.out.println();
		for (int i = 0; i < palabra_1.length(); i++) {		
				System.out.println(palabra_1.charAt(i));	
	
		}
		
	}
}
