
public class RevisaoDoZeroAoJava {

	public static void main(String[] args) {
		
		//JVM
		//JRE
		//JDK
		
		//int 
		int inteiro = 10;
		
		//double
		double numeroDouble = 10.0;
		
		//float
		float numeroFloat = 10.2f;
		
		//char
		char caracter = 's';
		
		//boolean
		boolean permicao = true;
		boolean permicao2 = false;
				
		//String
		String nome = "Luciano";
				
		//+ - * / %
		
		inteiro = inteiro + 10;
		inteiro += 10;
		
		inteiro = inteiro - 10;
		inteiro -= 10;
		
		inteiro = inteiro * 10;
		inteiro *= 10;
		
		numeroDouble = numeroDouble / 10;
		numeroDouble /= 10;
		
		//> >= <= < == !=
		
		boolean valor = 10 > 5; //true
		valor = 10 >= 5; // true
		valor = 10 <= 5; // false
		valor = 10 < 5; //false
		valor = 10 == 5; //false
		valor = 10 != 5; //true		
		
		// if else
		
		if(10 > 5) {
			inteiro = 10;
		} else {
			inteiro = 5;
		}
		
		// for
		
		for(int i = 0; i < 10; i++) {
			System.out.println("O i vale: " + i);
		}
		
		// while
		
		while(inteiro < 10) {
			System.out.println(inteiro++);
		}
		
		//do while
		
		do {
			System.out.println(inteiro++);
		} while(inteiro < 10);
		
		// switch case
		
		switch (inteiro) {
			case 10:
				System.out.println("10");
				break;
			case 20:
				System.out.println("20");
				break;
			case 30:
				System.out.println("30");
				break;
			default:
				System.out.println("Nenhum dos casos");
				break;
		}
	
	}
		
		//metodos / funcoes
		
		boolean funcao(int valor, double valor2) {
			return true;					
				
	}

}
