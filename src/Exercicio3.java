import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String args[]) {
		
		Scanner leitor = new Scanner(System.in);
		
		int  numero1, i1, fat1, numero2, i2, fat2;
		double resultado;
		
		System.out.println("Digite o número que deseja fatorar");
		numero1 = leitor.nextInt();
		i1 = numero1 -1;
		fat1 = numero1;
		
		while(i1>0) {
			fat1 = fat1 * i1;
			i1 = i1 -1;
		}
		
		
		numero2 = 1;
		fat2 = numero2;
		i2 = numero2 -1;
		
		while(i2>1) {
			fat2 = fat2 * i2;
			i2 = i2 -1;
		}
		
	
		
		System.out.println("A fatorial de "+numero1+ " é "+fat1);
		
		
	}

}
