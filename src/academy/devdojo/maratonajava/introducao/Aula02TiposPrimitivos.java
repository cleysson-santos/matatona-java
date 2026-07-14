package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    static void main(String[] args) {
        // int, char, long, float, double, byte, short, boolean
        int idade = 29;
        long numeroGrande = (long) 155.23;
        double salarioDouble = 2000.0;
        float salarioFloat = (float)2500.0D;
        byte idadeByte = 10;
        short idadeShort = 32000;
        boolean verdade = true;
        boolean falso = false;
        char caractere = 67;
        String nome = "Goku";


        System.out.println("A idade é: " + idade + " anos!");
        System.out.println(falso);
        System.out.println(caractere);
        System.out.println(numeroGrande);
        System.out.println("Oi, meu nome é " + nome +"!");
    }
}
