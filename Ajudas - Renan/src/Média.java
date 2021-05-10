import java.util.Scanner;

public class Média {

	public static void main(String[] args) {

		double NM;
		double N;
		double soma = 0;
		double maior = 0;
		Scanner entrada = new Scanner(System.in);
		
		//NM = Número a ser tirados a média
		System.out.println("Informe a quantidade de números que deseja tirar a média");
		NM = entrada.nextInt();
		
		for(int x = 1; x <= NM; x++) {
			System.out.println("Informe o " + x + " Número");
			N = entrada.nextInt();
			
		
			if(N > maior) {
				maior = N;
			}
			
			soma += N ;
		}
		System.out.println("Média: " + soma/NM);
		
		System.out.println("O maior dos números inseridos é: "+ maior);
	}

}
