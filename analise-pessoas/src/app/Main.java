package app;

import java.util.Locale;
import java.util.Scanner;
import model.Pessoas;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serão digitadas? ");
        int n = sc.nextInt();
        double mediaAltura = 0;
        Pessoas[] vect = new Pessoas[n];

        for(int i = 0 ; i < vect.length ; i++){
            Pessoas p = new Pessoas();
            System.out.printf("\nDados da %da pessoa:\n", i + 1);
            System.out.print("Nome: ");
            sc.nextLine();
            p.setName(sc.nextLine());
            System.out.print("Idade: ");
            p.setIdade(sc.nextInt());
            System.out.print("Altura: ");
            p.setAltura(sc.nextDouble());
            mediaAltura += p.getAltura();
            vect[i] = p;
        }

        mediaAltura = mediaAltura / n;
        double percentage = 0;

        for(int i = 0 ; i < vect.length ; i++){
            if(vect[i].getIdade() < 16){
                percentage++;
            }
        }

        System.out.printf("\nAltura média: %.2f", mediaAltura);
        percentage = (percentage*100)/n;
        System.out.printf("\nPessoas com menos de 16 anos: %.2f%%\n", percentage);
        for(int i = 0 ; i < vect.length ; i++){
            if(vect[i].getIdade() < 16){
                System.out.println(vect[i].getName());
            }
        }
        sc.close();
    }
}
