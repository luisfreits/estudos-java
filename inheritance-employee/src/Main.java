import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<Employee>();

        Employee emp = new Employee();

        System.out.print("Enter the number of employees: ");
        int employees = sc.nextInt();

        for (int i = 1 ; i <= employees ; i++){
            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsourced (y/n)? ");
            sc.nextLine();
            String outsourced = sc.nextLine();
            if (outsourced.equalsIgnoreCase("y")){
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Hours: ");
                Integer hours = sc.nextInt();
                System.out.print("Value per hour: ");
                Double valuePerHour = sc.nextDouble();
                System.out.print("Additional charge: ");
                Double charge = sc.nextDouble();
                emp = new OutsourcedEmployee(name, hours, valuePerHour, charge);
                list.add(emp);
            }
            else {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Hours: ");
                Integer hours = sc.nextInt();
                System.out.print("Value per hour: ");
                Double valuePerHour = sc.nextDouble();
                emp = new Employee(name, hours, valuePerHour);
                list.add(emp);
            }
        }
        System.out.println();
    System.out.println("PAYMENTS:");
        for (Employee e : list){
            System.out.println(e.getName() + " - $ " + String.format("%.2f", e.payment()));
        }

        sc.close();
    }
}
