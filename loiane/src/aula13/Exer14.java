package aula13;
import java.util.Scanner;
public class Exer14 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o tamanho do arquivo: ");
		double tamArquivo = scan.nextDouble();
		
		System.out.println("Entre com a velocidade tamanho do arquivo: ");
		double velInternet = scan.nextDouble();
		
		double tempo = tamArquivo / velInternet;
		
		System.out.println("Tempo de dowloads: " + tempo);
		
		
		

	}

}
