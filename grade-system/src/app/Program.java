package app;

import java.util.Scanner;
import java.util.Locale;
import model.Grade;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Grade x = new Grade();

        System.out.print("Enter student name: ");
        x.name = sc.nextLine();

        System.out.print("Enter the 1st trimester grade: ");
        x.first = sc.nextDouble();

        System.out.print("Enter the 2nd trimester grade: ");
        x.second = sc.nextDouble();

        System.out.print("Enter the 3rd trimester grade: ");
        x.third = sc.nextDouble();

        String situation = x.average();
        System.out.print(situation);

        sc.close();
    }
}
