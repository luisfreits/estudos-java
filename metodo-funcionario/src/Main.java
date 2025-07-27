import entities.Funcionario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos funcionarios deseja inserir ");
        int n = sc.nextInt();
        sc.nextLine();

        Funcionario[] funcionarios = new Funcionario[n];

        for(int i = 0; i < funcionarios.length; i++){
            System.out.print("Funcionario " + (i+1) + ":\n");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Salário: ");
            double salario = sc.nextDouble();
            sc.nextLine();
            funcionarios[i] = new Funcionario(nome, idade, salario);
        }

        Funcionario.exibirFuncionarios(funcionarios);
        System.out.println("Média salarial: " + Funcionario.calcularMediaSalarial(funcionarios));

        sc.close();
    }
}