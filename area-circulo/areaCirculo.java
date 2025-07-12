import java.util.Scanner;
public class areaCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double raio, area;
        System.out.println("Área do Círculo");
        System.out.println("Insira o valor do raio:");
        raio = sc.nextDouble();
        area = Math.PI*Math.pow(raio,2);
        System.out.printf("A área do círculo é igual a %.4f", area);
    }
}