import java.util.Scanner;

public class Exercicio1 {
	public static void main(String args []) {
		
		Scanner leitor = new Scanner(System.in);
		
		int quantidade =0;
		
		System.out.println("Para entrar no castelo você deve acertar a quantidade de feijões. Qual é o seu palpite?");
		quantidade = leitor.nextInt();
		
		while(quantidade != 1238) {
			
			System.out.println("Errooou! Digite novamente");
			quantidade = leitor.nextInt();
		}
		
		System.out.println("Você Acertou! Parabéns! Entrada permitida");
		
		leitor.close();
	}
	

}
