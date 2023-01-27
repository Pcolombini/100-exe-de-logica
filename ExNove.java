import java.util.*;

public class ExNove{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final double PI = 3.14d;

		System.out.println("Qual o tamanho do raio: ");
		double raio = sc.nextDouble();
		double area = PI*Math.pow(raio,2);
		System.out.println("Qual o tamanho da altura: ");
		double altura = sc.nextDouble();
		double volume = area*altura;

		System.out.println("O valor do volume da lata de óleo é :"+volume);
	}
}