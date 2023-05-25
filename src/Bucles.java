import java.util.Scanner;

public class Bucles {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		
		System.out.println("Introduce un numero:");
		int num = sc.nextInt();
		
		for (int i=1; i<=num; i++) {	
			System.out.println(i);
		}
		System.out.println();
		System.out.println("Introduce un numero:");
		int num2 = sc.nextInt();
		
		for (int i=1; i<=num2; i++) {
			if(i/2!=0) {
				System.out.println(i);

			}

		}
		
	}

}
