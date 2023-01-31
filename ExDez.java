import java.util.Scanner;

public class ExDez {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número");
		int n = sc.nextInt();
		
		while(n>0) {
			System.out.println("O resto da divisão "+n%2);
			n = n/2;
			System.out.println(n);
//			System.out.println("");
		}
		
	}

}