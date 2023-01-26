package logica;

import java.util.Scanner;

public class AreaCircunferencia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

// 				3. Dado o tamanho do raio de uma circunferência, 
//				calcular a área e o perímetro da mesma
				
//				Fórmula da área da circunferência
//				Nesse caso, em um círculo de raio r, 
//				temos a área do círculo: A = π*r²

//				C = 2 * π * r, onde: 
// 				C = comprimento da circunferência ou perímetro.
		
				final double PI = 3.14159265359;

				System.out.println("Entre com o tamanho do R: ");
				double raio = sc.nextDouble();
				double area = PI*Math.pow(raio,2);
				double perimetro = 2 * PI * raio;

				System.out.println("A área do circulo é: "+area);
				System.out.println("O perímetro do circulo é: "+perimetro);
	}

}
