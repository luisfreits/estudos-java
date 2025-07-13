import java.util.Scanner;
public class WhileCombustivel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int entrada = 0, alcool = 0, gasolina = 0, diesel = 0;
        System.out.printf("1.Álcool%n2.Gasolina%n3.Diesel%n4.Encerrar%n");
        System.out.printf("Insira o tipo de combustível abastecido:%n");
        entrada = sc.nextInt();
        while (entrada != 4){
            if (entrada == 1){
                alcool ++;
            } else if (entrada == 2){
                gasolina ++;
            } else if (entrada == 3){
                diesel ++;
            } else {
                System.out.printf("Código Inválido%n");
            }
            System.out.printf("Insira o tipo de combustível abastecido:%n");
        entrada = sc.nextInt();
        }
        System.out.printf("%nEncerrado%n");
        System.out.printf("Álcool: %d%nGasolina: %d%nDiesel: %d", alcool, gasolina, diesel);
        sc.close();
    }
}