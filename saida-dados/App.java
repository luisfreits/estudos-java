import java.util.Locale;
public class App {
    public static void main(String[] args) {

        //Declaração dos produtos
        String product1 = "Computer";
        String product2 = "Office desk";

        //Declaração das informações do cliente
        int age = 30;
        int code = 5290;
        char gender = 'F';

        //Declaração de preços e medidas
        double price1 = 2100.00;
        double price2 = 650.50;
        double measure = 53.234567;

        //Exibição dos produtos e preços
        System.out.printf("Products:%n%s, which price is $ %.2f", product1, price1);
        System.out.printf("%n%s, which price is $ %.2f", product2, price2);

        //Informações do cliente
        System.out.printf("%n%nRecord: %d years old, code %d and gender: %c", age, code, gender);

        //Demonstração de formatação numérica
        System.out.printf("%n%nMeasure with eight decimal places: %.8f", measure);
        System.out.printf("%nRounded (three decimal places): %.3f", measure);

        //Mudança para formatação americana
        Locale.setDefault(Locale.US);
        System.out.printf("%nUS decimal point: %.3f", measure);
    }
}
