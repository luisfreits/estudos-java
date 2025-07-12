import java.util.Scanner;
public class AreasGeometricas {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;
    System.out.println("Áreas geometricas a partir de três valores");
    System.out.println("Insira valor de A:");
    a = sc.nextDouble();
    System.out.println("Insira valor de B:");
    b = sc.nextDouble();
    System.out.println("Insira valor de C:");
    c = sc.nextDouble();
    triangulo = (a*c)/2;
    circulo = Math.PI*Math.pow(c,2);
    trapezio = (a+b)*c/2;
    quadrado = Math.pow(b,2);
    retangulo = a*b;
    System.out.printf("TRIÂNGULO: %.3f%nCÍRCULO: %.3f%nTRAPÉZIO: %.3f%nQUADRADO: %.3f%nRETÂNGULO: %.3f%n",
                     triangulo, circulo, trapezio, quadrado, retangulo);
    sc.close();
    }
}