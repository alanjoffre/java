public class ImprimindoVariaveis {
    // Tipos primitivos
    public static void main(String[] args){
        int idade = 10; // Variável sempre começa com letra minuscula
        int idadeDosPaisPAraCadastro = 40; // primeira letra minuscula e o restante maiuscula
        double salarioDoube = 3000;
        float salarioFloat = 3000;
        byte idadeByte = 12;
        short idadeShort = 32767;
        boolean verdadeiro = true;
        boolean falso = false;
        long numeroGrande = 1000L;
        char caractere = 'A'; //2 bytes //tabela unicode
        String nome = "William";
        System.out.println(idade);
        System.out.println(idadeDosPaisPAraCadastro);
        System.out.println("A idade é: "+idadeDosPaisPAraCadastro);
        System.out.println(nome+" de idade "+idade);
    }
    
}
