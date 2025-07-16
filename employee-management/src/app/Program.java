package app;
import java.util.Scanner;
import model.Employee;
import java.util.Locale;
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee x;
        x = new Employee();
        Locale.setDefault(Locale.US);
        System.out.print("Name: ");
        x.name = sc.nextLine();
        System.out.print("Gross salary: ");
        x.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        x.tax = sc.nextDouble();

        System.out.printf("Employee: %s\n", x);

        System.out.print("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        x.increase(percentage);

        System.out.printf("Update data: %s", x);
        sc.close();
    }
    
}
