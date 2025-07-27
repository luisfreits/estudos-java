package entities;

public class Funcionario {
    private String nome;
    private Integer idade;
    private double salario;

    public Funcionario() {
    }

    public Funcionario(String nome, Integer idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static double calcularMediaSalarial(Funcionario[] funcionarios) {
        double soma = 0.0;
        for(Funcionario f : funcionarios) {
            soma += f.getSalario();
        }
        return soma / funcionarios.length;
    }

    public static void exibirFuncionarios(Funcionario[] funcionarios) {
        for(Funcionario f : funcionarios) {
            System.out.println(f);
        }
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", salario=" + salario +
                '}';
    }
}