package Curso1Aplicacao;
import java.util.Locale;
import java.util.Scanner;

public class ExerciciosII {
	public static void main (String[] args){
		/* PRIMEIRO EXERICIO Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma 
mensagem explicativa, conforme exemplos
		  Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro valor ");
		int valorI = scanner.nextInt();
		System.out.println("Digite o segundo valor ");
		int valorII = scanner.nextInt();
		
		int soma = valorI + valorII;
		System.out.println("Soma = " + soma);
		scanner.close();*/
		
		/*SGUNDO EXERCICIO Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro 
casas decimais conforme exemplos.
Fórmula da área: area = π . raio2
Considere o valor de π = 3.14159

		Scanner scanner = new Scanner (System.in);
		double raio = scanner.nextDouble();
		double pi = 3.14159;
		
		double area = pi*raio*raio;
		System.out.printf("A = %.4f%n",area);
		scanner.close();*/
		
		/* Terceiro exercicio Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto 
		//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D)
		Scanner scanner = new Scanner (System.in);
		System.out.println("Digite um valor: ");
		int A = scanner.nextInt();
		System.out.println("Digite um valor: ");
		int B = scanner.nextInt();
		System.out.println("Digite um valor: ");
		int C = scanner.nextInt();
		System.out.println("Digite um valor: ");
		int D = scanner.nextInt();
		
		int diferenca = A*B - C*D;
		System.out.println("DIFERENÇA = " + diferenca);
		scanner.close();*/
		
		/*Quarto exercicio Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
		//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
		//decimais
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner (System.in);
		double number = scanner.nextDouble();
		double horatrabalhada = scanner.nextDouble();
		double valorhora = scanner.nextDouble();
		double salario = valorhora*horatrabalhada;
		System.out.println("NUMBER: " + number);
		System.out.printf("SALARY: U$%.4f%n", salario);
		
		scanner.close();*/
		/*azer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
		//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner (System.in);
		System.out.println("Código do produto: ");
		double codigo = scanner.nextDouble();
		System.out.println("Quantidade de peças: ");
		double peca = scanner.nextDouble();
		System.out.println("Valor do produto: ");
		double valor = scanner.nextDouble();
		System.out.println("Código do produto: ");
		double codigoII = scanner.nextDouble();
		System.out.println("Quantidade de peças: ");
		double pecaII = scanner.nextDouble();
		System.out.println("Valor do produto: ");
		double valorII = scanner.nextDouble();
		
		double precofinal = valor+valorII;
		System.out.printf("PREÇO FINAL: %.2f%n", precofinal);
		
		scanner.close();*/
		
		/*Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e 
		mostre: 
			a) a área do triângulo retângulo que tem A por base e C por altura. 
			b) a área do círculo de raio C. (pi = 3.14159) 
			c) a área do trapézio que tem A e B por bases e C por altura. 
			d) a área do quadrado que tem lado B. 
			e) a área do retângulo que tem lados A e B
import java.util.Locale;
import java.util.Scanner;

public class uri1012 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		triangulo = A * C / 2.0;
		circulo = 3.14159 * C * C;
		trapezio = (A + B) / 2.0 * C;
		quadrado = B * B;
		retangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		
		sc.close();
	}
}*/
		
	}
}
