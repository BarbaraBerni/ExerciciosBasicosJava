package Curso1Aplicacao;
import java.util.Locale;
import java.util.Scanner;

/* NO EXERCICIO ELE VAI FAZER UM PROGRAMA QUE PRECISA LER MEDIDAS E RETORNAR OS VALORS DELAS DEPOIS DE CALCULADAS
 * ENTRADA: 10.0, 30.0, 200.0. SAIDA CALCULO AREA ALTURA * LARGURA E PRECO AREA * PRECO METRO*/

public class ExercicioI {
	
  public static void main (String[] args) {
	  Locale.setDefault(Locale.US); //Para mudar o código aceitar idioma ingles
	  
  Scanner scanner = new Scanner(System.in);
  System.out.println("Digite a largura: ");
  double largura = scanner.nextDouble();
  System.out.println("Digite o comprimento: ");
  double comprimento = scanner.nextDouble();
  System.out.println("Digite valor do metro: ");
  double precoMetro = scanner.nextDouble();
  
  double area = largura*comprimento;
  double preco = area*precoMetro;
  
  System.out.printf("Área = %.2f%n" + area);
  System.out.printf("Preco = %.2f%n" + preco);
  
  scanner.close();
}
}
