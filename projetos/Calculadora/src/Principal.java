import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int valor1;
		int valor2;
		int soma;
		
		while(true) {
			System.out.println("------ Soma de dois números ------");
			System.out.println("-----Digite o primeiro número-----");
			valor1 = Integer.parseInt(scanner.nextLine());
			System.out.println("-----Digite o segundo número-----");
			valor2 = Integer.parseInt(scanner.nextLine());
			soma = somaNumero(valor1, valor2);
			System.out.println("A soma de " + valor1 + " + " + valor2 + " = "+ soma);
			if(soma >= 100) {
				System.out.println("Soma maior ou igual a 100");
			} else {
				System.out.println("Soma menor que 100");
			}
		}

	}
	
	public static int somaNumero(int numero1, int numero2) {
		return numero1 + numero2;
	}
}
