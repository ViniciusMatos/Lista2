import java.util.Scanner;

public class Exercicio1 {
	public static void main(String args []) {
		
		Scanner leitor = new Scanner(System.in);
		
		int quantidade =0;
		
		System.out.println("Para entrar no castelo voc� deve acertar a quantidade de feij�es. Qual � o seu palpite?");
		quantidade = leitor.nextInt();
		
		while(quantidade != 1238) {
			
			System.out.println("Errooou! Digite novamente");
			quantidade = leitor.nextInt();
		}
		
		System.out.println("Voc� Acertou! Parab�ns! Entrada permitida");
		
		leitor.close();
	}
	

}
