import java.util.Scanner;
public class diferencaProduto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, d, diferenca;
        System.out.println("Diferença entre produtos");
        System.out.println("Insira o primeiro valor:");
        a = sc.nextDouble();
        System.out.println("Insira o segundo valor:");
        b =  sc.nextDouble();
        System.out.println("Insira o terceiro valor:");
        c = sc.nextDouble();
        System.out.println("Insira o quarto valor:");
        d = sc.nextDouble();
        sc.close();
        diferenca = a*b-c*d;
        System.out.printf("A diferença entre o produto de %.2f e %.2f e o produto de %.2f e %.2f é: %.2f", a, b, c, d, diferenca);
    }
}