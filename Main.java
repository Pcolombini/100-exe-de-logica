package logica;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 6. Ler dois números inteiros e exibir o quociente 
		// e o resto da divisão inteira entre eles
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número inteiro: ");
		int numeroUm = sc.nextInt();
		System.out.println("Digite outro número inteiro: ");
		int numeroDois = sc.nextInt();
		
		int quociente = numeroUm/numeroDois;
		int restoDiv = quociente%2;
		
		System.out.println("O quociente da divisão entre os números informados é "+quociente);
		System.out.println("O resto da divisão inteira entre os números é "+restoDiv);
	}

}
