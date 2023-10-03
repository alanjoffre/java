public class Operadores2 {

    // ++ Incremento | -- Decremento | + Adição | - Subtração | * Multiplicação | /
    // Divisão | % Módulo | ! Negação

    public static void main(String[] args) {
        int numeroInteiro = 20;
        long numeroLong = 200000L;

        double numeroDouble = 10d;
        float numeroFloat = 20f;
        numeroFloat = (float) numeroDouble;
        int resto = 20%2;
        System.out.println("Resto da divisão "+(21%2));//Resto da divisão 1 = impar
        System.out.println("Resto da divisão "+(20%2));//Resto da divisão zero = par
        System.out.println("Resto da divisão "+(resto));
        System.out.println(numeroDouble);
    }

}
