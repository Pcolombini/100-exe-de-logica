import java.util.*;

class ExDoze {

	/**
	*12. Faça um algoritmo que transforme uma 
	* velocidade fornecida em m/s pelo usuário paraKm/h. 
	* Para tal, multiplique o valor em m/s por 3,6. 
	*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a velocidade em m/s: ");
		double velocidade = sc.nextDouble();

		double veloConv = velocidade*3.6;

		System.out.println("A velocidade: "+velocidade+" m/s, equivale a "+veloConv+" Km/h");
	}


}