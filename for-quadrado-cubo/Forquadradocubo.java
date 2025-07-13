import java.util.Scanner;
public class Forquadradocubo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int N, quadrado, cubo;
    System.out.println("Insira o número de linhas:");
    N = sc.nextInt();
    for (int i = 1; i <= N; i++){
        quadrado = i*i;
        cubo = i*i*i;
        System.out.printf("%d %d %d%n", i, quadrado, cubo);
    }
    }
}
