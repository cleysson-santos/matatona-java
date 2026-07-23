package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Fiat";
        carro1.modelo = "Uno";
        carro1.ano = 2010;

        carro2.nome = "Fiat";
        carro2.modelo = "Pálio";
        carro2.ano = 2015;

        carro1 = carro2;

        System.out.println("Carro 1: \n" + carro1.nome + "\n" + carro1.modelo + "\n" + carro1.ano);
        System.out.println("\nCarro 2: \n" + carro2.nome + "\n" + carro2.modelo + "\n" + carro2.ano);

    }
}
