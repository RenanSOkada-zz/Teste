import java.util.Scanner;

public class M�dia {

	public static void main(String[] args) {

		double NM;
		double N;
		double soma = 0;
		double maior = 0;
		Scanner entrada = new Scanner(System.in);
		
		//NM = N�mero a ser tirados a m�dia
		System.out.println("Informe a quantidade de n�meros que deseja tirar a m�dia");
		NM = entrada.nextInt();
		
		for(int x = 1; x <= NM; x++) {
			System.out.println("Informe o " + x + " N�mero");
			N = entrada.nextInt();
			
		
			if(N > maior) {
				maior = N;
			}
			
			soma += N ;
		}
		System.out.println("M�dia: " + soma/NM);
		
		System.out.println("O maior dos n�meros inseridos �: "+ maior);
	}

}
