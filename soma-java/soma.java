import java.util.Scanner;
public class soma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x, y, z;
        String entrada1, entrada2;
        System.out.println("Calculadora de soma");
        System.out.println("Insira o primeiro valor:");
        entrada1 = sc.nextLine().replace(",", ".");
        x = Double.parseDouble(entrada1);
        System.out.println("Insira o segundo valor:");
        entrada2 = sc.nextLine().replace(",", ".");
        y = Double.parseDouble(entrada2);
        z = x + y;
        System.out.printf("A soma de %.2f + %.2f é igual a %.2f", x, y, z);
        sc.close();
    }
}