
public class Funcoes {

	public static void main(String[] args) {
		
		int inteiro = 10;
		System.out.println(inteiro);
		
		inteiro = adicionaUm(inteiro);
		System.out.println(inteiro);
		
	}
	
	public static int adicionaUm(int valor) {
		return valor + 1;
	  //return valor++;
	}

}
