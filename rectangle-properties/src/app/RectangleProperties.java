package app;
import java.util.Scanner;
import java.util.Locale;
import model.Rectangle;
public class RectangleProperties {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        double area, perimeter, diagonal;
        Rectangle x;
        x = new Rectangle();

        System.out.println("Enter rectangle width and height:");
        System.out.println("Width:");
        x.w = sc.nextDouble();
        System.out.println("Height:");
        x.h = sc.nextDouble();

        area = x.area();
        perimeter = x.perimeter();
        diagonal = x.diagonal();

        System.out.printf("Area: %.2f\n", area);
        System.out.printf("Perimeter: %.2f\n", perimeter);
        System.out.printf("Diagonal: %.2f\n", diagonal);
        sc.close();
    }
}