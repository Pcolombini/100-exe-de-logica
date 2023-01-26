import java.util.*;

public class PerimetroTriangulo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 4. Dado os três lados de um triângulo determinar o perímetro do mesmo
		// P = l+l+l+l

		System.out.println("Qual o tamanho do 1° lado");
		int ladoTrianguloUm = sc.nextInt();
		System.out.println("Qual o tamanho do 2° lado");
		int ladoTrianguloDois = sc.nextInt();
		System.out.println("Qual o tamanho do 3° lado");
		int ladoTrianguloTres = sc.nextInt();

		int perimetroTriangulo = ladoTrianguloUm+ladoTrianguloDois+ladoTrianguloTres;

		System.out.println("O Perimetro do Triangulo é: "+perimetroTriangulo);


	}
}