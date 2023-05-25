import java.util.Scanner;

public class Condicionales {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduce el primer numero:");
		int num_1 = sc.nextInt();
		System.out.println("Introduce el segundo numero:");
		int num_2 = sc.nextInt();

		if(num_1>num_2) {
			System.out.println("El numero mayor es: "+num_1);
			if(num_1/2 == 0) {
				System.out.println("Es par");
			}else {
				System.out.println("Es par");
			}
		}else {
			System.out.println("El numero mayor es: "+num_2);
			if(num_2/2 == 0) {
				System.out.println("Es par");
			}else {
				System.out.println("Es par");
			}
		}
		
	}

}
