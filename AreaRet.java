package logica;

import java.util.Scanner;

public class AreaRet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Dado o tamanho da base e da altura de um retângulo, calcular a sua área e o seu
//		perímetro.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com tamanho da base: ");
		int base = sc.nextInt();
		System.out.println("Entre com tamanho da Altura: ");
		int altura = sc.nextInt();
		
		int areaRet = base*altura;
		
		System.out.println("A área do retângulo é: "+areaRet);

	}

}
