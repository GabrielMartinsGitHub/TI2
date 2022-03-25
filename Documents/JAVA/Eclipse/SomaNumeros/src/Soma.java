import java.util.*;
public class Soma {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]) {
		int num1, num2, soma;
		
		System.out.print("Digite o num1: ");
		num1 = sc.nextInt();
		System.out.print("Digite o num2: ");
		num2 = sc.nextInt();
		
		soma = num1 + num2;
		
		System.out.println("Soma: " + soma);
	}
	
}