package app;

import entities.ContaCorrente;
import entities.Titular;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Criação do objeto titular da conta:
        ContaCorrente cc1 = new ContaCorrente(1);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite o seu cpf: ");
        String cpf = sc.nextLine();
        cc1.setTitular(new Titular(nome,cpf));

        cc1.depositar(10000);
        cc1.sacar(50);

    }

}
