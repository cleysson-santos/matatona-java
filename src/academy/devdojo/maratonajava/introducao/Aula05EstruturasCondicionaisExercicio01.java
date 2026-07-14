package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionaisExercicio01 {
    public static void main(String[] args) {
        double salarioAnual = 84000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;

        if(salarioAnual <= 34712) {
            valorImposto = salarioAnual * primeiraFaixa;
        } else if (salarioAnual > 34712 && salarioAnual <= 68507) {
            valorImposto = salarioAnual * segundaFaixa;
        } else {
            valorImposto = salarioAnual * terceiraFaixa;
        }
        System.out.println("Para o salário de " + salarioAnual + " e o imposto anual é de " + valorImposto + "%");
    }
}
