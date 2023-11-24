// Daniely Harumi Terasoto e Helena Monteiro Coracini

import java.util.Scanner;

import java.util.Random;



public class Projeto2 {



	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int op = 1;

		int[] vetor = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };



		while (op != 0) {



			System.out.println("      MENU DE OPÇÕES                     ");

			System.out.println("1ª OPÇÃO: COLETA DADOS DO VETOR");

			System.out.println("2ª OPÇÃO: GERA VALORES RÂNDOMICOS PARA O VETOR");

			System.out.println("3ª OPÇÃO: IMPRIME DADOS DO VETOR");

			System.out.println("4ª OPÇÃO: IMPRIME VETOR INVERTIDO");

			System.out.println("5ª opção: SOMA VALORES DO VETOR");

			System.out.println("6ª opção: SOMA PERSONALIZADA DE VALORES DO VETOR");

			System.out.println("7ª opção: MEDIA DOS VALORES DO VETOR");

			System.out.println("8ª opção: MAIOR VALOR DENTRO DO VETOR");

			System.out.println("9ª opção: MENOR VALOR DENTRO DO VETOR");

			System.out.println("Digite 0 para sair");

			System.out.println();

			System.out.println("Digite a opção desejada:");

			op = teclado.nextInt();



			if (op == 0) {

				System.out.println("Final do programa.");

				break;


			} else if (op == 1) {

				int[] resultaVetor = coletaVetor(vetor);


			} else if (op == 2) {

				System.out.println("Qual o valor máximo para os valores do vetor: ");

				int max = teclado.nextInt();

				vetor = geraVetorRandomico(vetor, max);

				System.out.print("Valores randômicos gerados: ");



				for (int i = 0; i < vetor.length; i++) {

					if (i < vetor.length - 1) {

						System.out.print(vetor[i] + ", ");

					} else {

						System.out.print(vetor[i]);

						System.out.println();

					}

				}



			} else if (op == 3) {

				imprimeVetor(vetor);

				System.out.println();



			} else if (op == 4) {

				imprimeVetorInvertido(vetor);

				System.out.println();

				System.out.println();



			} else if (op == 5) {

				int somaTotal = somaTodos(vetor);

				System.out.println("Soma de todos os valores : " + somaTotal);

				System.out.println();



			} else if (op == 6) {



				System.out.println("informa o índice inicial: ");

				int inicio = teclado.nextInt();

				System.out.println("informa o índice final: ");

				int termino = teclado.nextInt();

				if (inicio > termino) {

					System.out.println("Verifique as restrições do algoritmo");



				}



				int somapersonalizada = somaPersonalizada(vetor, inicio, termino);

				System.out.println("O valor da soma é: " + somapersonalizada);



			} else if (op == 7) {

				double media = media(vetor);

				System.out.print("Média: " + media);

				System.out.println();



			} else if (op == 8) {

				int maiorvalor = maiorValor(vetor);

				System.out.println("O maior número é: " + maiorvalor);

				System.out.println();



			} else if (op == 9) {

				int menorValor = menorValor(vetor);

				System.out.println("O menor número é: " + menorValor);

				System.out.println();



			} else if (op > 9) {

				System.out.println("Opção inválida");

				System.out.println();



			}

		}

	}



	public static int[] coletaVetor(int[] vetor) {

		Scanner teclado = new Scanner(System.in);



		for (int i = 0; i < vetor.length; i++) {

			System.out.print("Informe o " + i + "º valor do vetor: ");

			vetor[i] = teclado.nextInt();

		}

		return vetor;

	}



	public static int[] geraVetorRandomico(int[] vetor, int max) {

		Random r = new Random();

		int[] x = new int[vetor.length];



		for (int i = 0; i < vetor.length; i++) {

			x[i] = r.nextInt(max + 1);

		}

		return x;

	}



	public static void imprimeVetor(int[] vetor) {

		System.out.println("Dados do vetor:");



		for (int i = 0; i < vetor.length; i++) {

			if (i < vetor.length - 1) {

				System.out.print(vetor[i] + ", ");

			} else {

				System.out.println(vetor[i]);



			}



		}



	}



	public static void imprimeVetorInvertido(int[] vetor) {

		System.out.println("Dados do vetor:");



		for (int i = vetor.length - 1; i >= 0; i--) {

			if (i < vetor.length && i > 0) {

				System.out.print(vetor[i] + ", ");

			} else {

				System.out.print(vetor[i]);



			}



		}



	}



	public static int somaTodos(int[] vetor) {

		int soma = 0;

		for (int i = 0; i < vetor.length; i++) {

			soma = soma + vetor[i];

		}

		return soma;

	}



	public static int somaPersonalizada(int[] vetor, int inicio, int termino) {

		int soma = 0;

		for (int i = inicio; i <= termino; i++) {

			soma = soma + vetor[i];



		}

		return soma;

	}



	public static double media(int[] vetor) {

		double soma = 0;


		for (int i = 0; i < vetor.length; i++) {

		soma = soma + vetor[i];

		}



		double media = soma / 10;

		return media;

	}



	public static int maiorValor(int[] vetor) {

		int maior = vetor[0];

		for (int i = 0; i < vetor.length; i++) {

			if (maior < vetor[i]) {

				maior = vetor[i];

			}

		}

		return maior;



	}



	public static int menorValor(int[] vetor) {

		int menor = vetor[0];


		for (int i = 0; i < vetor.length; i++) {

			if (menor > vetor[i]) {

				menor = vetor[i];

			}

		}

		return menor;

	}

}

