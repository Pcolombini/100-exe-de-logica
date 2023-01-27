import java.util.*;

public class ExOito{

/**
 * 8. Dado que a fórmula para conversão 
 * de Fahrenheit para Celsius é C = 5/9 (F – 32), 
 * leu um valor de temperatura em Fahrenheit e exibi-lo em Celsius 
*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual a temperatura em Farenheit: ");
		double farenheit = sc.nextDouble();

		double conversorCelsius = (farenheit-32)*5/9;
		System.out.println("A temperatura em C° "+conversorCelsius); 



	}
}