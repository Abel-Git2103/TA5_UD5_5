import java.util.Scanner;
public class DivisibleAPP {

	public static void main(String[] args) {
		
		String valorDivisible = "";
		
		Scanner consola = new Scanner(System.in);
		System.out.println("Indica el valor: ");
		valorDivisible = consola.nextLine();
		
		int valorDivisibleInteger = Integer.parseInt(valorDivisible);
		
		if((valorDivisibleInteger % 2) == 0) {
			System.out.println("El número " + valorDivisible + " es divisible de 2.");
		}else {
			System.out.println("El número " + valorDivisible + " no es divisible de 2.");
		}
		
	}
}
