package app;
import java.util.Locale;
import java.util.Scanner;
import model.Numeros;

 public class Main {
   public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        Numeros[] vect = new Numeros[n];
        for(int i = 0; i < vect.length ; i++){
            System.out.print("Digite um número: ");
            vect[i] = new Numeros(sc.nextDouble());
        } 
        
        System.out.println();
        System.out.println("NÚMEROS NEGATIVOS:");
        for(int i = 0 ; i < vect.length ; i++){
            if (vect[i].getValor() < 0){
                System.out.println(vect[i].getValor());
            }
        }
        sc.close();
    }
}
