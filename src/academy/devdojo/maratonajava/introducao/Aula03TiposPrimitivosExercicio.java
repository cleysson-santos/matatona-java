package academy.devdojo.maratonajava.introducao;

/*
    Prática

    Crie variáveis para campos descritos abaixo entre <> e imprima a seguinte mensagem:

    Eu <nome>, morando no endereço <endereço>,
    confirmo que recebi o salário de <salario>, na data <data>
 */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Sasuke";
        String endereco = "Konoha";
        double salario = 1997.54;
        String dataRecebimentoSalario = "03/07/2024";
        String relatorio = "Eu " +nome+ " morando no endereço " +endereco+ ", confirmo que recebi o salário de R$" +salario+ ", na data " +dataRecebimentoSalario;

        System.out.println(relatorio);
    }
}
