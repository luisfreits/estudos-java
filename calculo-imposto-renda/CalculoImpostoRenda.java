import java.util.Scanner;
public class CalculoImpostoRenda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double renda, imposto, resultado;
        System.out.printf("                 CÁLCULO DE IMPOSTO POR RENDA%n%n");
        System.out.printf("            Renda              |  Imposto de Renda%n");
        System.out.printf(" de 0,00 até R$ 2000,00        |       Isento%n");
        System.out.printf(" de R$ 2000,01 até R$ 3000,00  |          8%%%n");
        System.out.printf(" de R$ 3000,01 até R$ 4500,00  |         18%%%n");
        System.out.printf(" acima de R$ 4500,00           |         28%%%n%n");
        System.out.printf("Insira a renda mensal:%n");
        String entrada = sc.nextLine().replace(",", ".");
        renda = Double.parseDouble(entrada);
        if (renda <= 2000){
            System.out.println("Isento de impostos");
        } else if (renda <= 3000){
            imposto = 0.08;
            renda -= 2000;
            resultado = renda * imposto;
            System.out.printf("Imposto sobre renda igual a R$%.2f", resultado);
        } else if (renda <= 4500){
            imposto = 0.18;
            renda -= 3000;
            resultado = renda * imposto;
            resultado += 1000 * 0.08;
            System.out.printf("Imposto sobre renda igual a R$%.2f", resultado);
        } else {
            imposto = 0.28;
            renda -= 4500;
            resultado = renda * imposto;
            resultado += 1500 * 0.18;
            resultado += 1000 * 0.08;
            System.out.printf("Imposto sobre renda igual a R$%.2f", resultado);
        }
        sc.close();
    }
}
