import java.util.*;

public class Exercicio2 {
 public static void main(String args[]) {
	 Scanner leitor = new Scanner(System.in);
	 
	 int media, nota, contador=1, acima=0, abaixo=0;
	 
	 System.out.println("Professor, digite a m�dia de notas da turma");
	 media = leitor.nextInt();
	 
	 while(contador<=50) {
		 
		 System.out.println("Digite a nota do "+contador+"� aluno");
		 nota = leitor.nextInt();
		 
		 if(nota>=media) {
			 acima++;
		 }else {
			 abaixo++;
		 }
		 contador++;
	 }
	 
	 System.out.println("Professor, voc� tem "+acima+" alunos com nota acima da m�dia e "+abaixo+" abaixo da m�dia");
	 leitor.close();
 }
}
