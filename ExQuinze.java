import java.util.*;

class ExQuinze{
	/**
	 * Num dia de sol, você deseja medir a altura de um prédio, 
	 * porém, a trena não é suficientemente longa. 
	 * Assumindo que seja possível medir sua sombra e a do prédio no chão, 
	 * e que você lembre da sua altura, 
	 * faça um programa para ler os dados necessários e calcular a altura do prédio.
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Calculo da altura de um prédio!");

		System.out.println("Qual o tamanho da sobra do prédio: ");
		Double sombraPredio = sc.nextDouble();

		System.out.println("Qual a sua altura: ");
		Double alturaPessoa = sc.nextDouble();

		System.out.println("Qual o tamanho da sua sombra: ");
		Double sombraPessoa = sc.nextDouble();

		Double multiAlturaPre = alturaPessoa*sombraPredio;
		Double divResulAlturaPred = multiAlturaPre/sombraPessoa;

		System.out.println("Comparando sua altura, e tamanho das sombras de prédio e sua, o prédio mede: "+divResulAlturaPred+"m");

	}
}