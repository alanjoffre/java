public class OperadoresLogicos {

    // && = AND
    // || = OR

    public static void main(String[] args) {
        int idade = 18;
        float salario = 1000f;

        System.out.println(idade >= 18 && salario >= 1000); // As duas situações tem que ser verdadeira
        System.out.println(idade >= 16 || salario >= 1000); // Apenas uma instrução tem que ser verdadeira
    }

}
