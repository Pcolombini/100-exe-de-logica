package logica;

import java.util.Scanner;

public class Perimetro {
	public static void main(String[] args) {
//		2. Dado o tamanho do lado de um quadrado, 
//		calcular a área e o perímetro do mesmo
		
//		Calculo do perímetro é dado pelo produto dos 4 lados
//		Calculo da área é dado pelo tamanho do lado ao quadrado
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o tamanho do lado do quadrado: ");
		int ladoQ = sc.nextInt();
		int perimetro = ladoQ*4;
		double area = Math.pow(ladoQ, 2);
		
		System.out.println("A área do quadrado é: "+area);
		System.out.println("O perímetro do quadrado é: "+perimetro);
		
		
		
		
	}
}
