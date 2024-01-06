package Curso1Aplicacao;
import java.util.Scanner;
public class AulaSacannerII {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x;
		String s1, s2, s3;
		
		s1 = scanner.nextLine();
		scanner.nextLine(); //AQUI É USADO PARA QUE QUANDO APERTE "ENTER" QUANDO DIGITAR O DADO ELE USE ESSE NEXT LINE VAZIO PARA NÃO USAR UM QUE JÁ ESTA SENDO USADO PORQUE ELE É CONSUMIDO QUANDO TEM UMA QUEBRA DE LINHA PENDENTE DEPOIS QUE DIGITA UM DADNO NO INT E APERTA ENTER
		s2 = scanner.nextLine();
		s3 = scanner.nextLine();
		
		System.out.println("Dados digitados: ");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		scanner.close();
	}
}