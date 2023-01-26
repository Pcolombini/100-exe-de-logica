import java.util.*;

class Sucessor{
	public static void main(String[] args) {
		// 5. Ler um número inteiro e exibir o seu sucessor.


		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com um número intiro: ");
		int num = sc.nextInt();

		int sucessor = num+1;

		System.out.println("O Sucessor do número digitado é: "+sucessor);
	}
}