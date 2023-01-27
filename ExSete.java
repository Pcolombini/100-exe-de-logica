//package pc;
import java.util.*;

public class ExSete{

/**
 * 7. Solicitar a idade de uma 
 * pessoa em dias e informar na tela a 
 * idade em anos, meses e dias
*/

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite sua idade em dias: ");
		int idadeDias = sc.nextInt();
		final int ANO = 365;
		final int MESES= 12;
		int idadeAnos = idadeDias/ANO;
		int idadeMeses = idadeAnos*MESES;

		System.out.println("Você tem: "+idadeAnos+" anos!");
		System.out.println("Você tem: "+idadeMeses+" Meses!");



	}
}

