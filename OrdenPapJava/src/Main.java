import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        float precioHS = 5;
        float precioVig = 3;
        double descuentoHS = .20;
        double descuentoVig = .15;
        double ordenHS;
        double ordenVig;
        double totalHS;
        double totalVig;
        double total;
        String rep;
        // Variables para enseñar los descuentos en numeros enteros
        double displayHS = descuentoHS * 100;
        double displayVig = descuentoVig * 100;
        DecimalFormat df = new DecimalFormat("0.##");
        // cierre de uso de decimal format

        System.out.printf("Hola bienvenido!\nhoy tenemos descuentos en:\nHojas de Hielo Seco: " + df.format(displayHS) +"%%"+ "\nViguetas: " + df.format(displayVig) +"%%"+ "\n");
        System.out.println("Introduce la cantidad de hojas de Hielo Seco:");
        ordenHS = leer.nextInt();
        leer.nextLine();
        System.out.println("Introduce la cantidad de Viguetas:");
        ordenVig = leer.nextInt();
        leer.nextLine();

        // Operaciones para calcular el total
        totalHS = ordenHS * precioHS;
        totalVig = ordenVig * precioVig;
        descuentoHS *= totalHS;
        descuentoVig *= totalVig;
        totalHS -= descuentoHS;
        totalVig -= descuentoVig;
        total = totalHS + totalVig;

        System.out.println("Desea pagar al contado o directo?");
        rep = leer.nextLine();

        if (rep.contains("contado")){
            double descuentoCon = total * .07;
            total -= descuentoCon;
            System.out.printf("Por ser pago a contado se aplica un descuento del 7%%\nEl costo total es de: %.2f%n", total);
        }
        else if (rep.contains("directo")){
            System.out.printf("El costo total es de: %.2f%n", total);
            }
        else {
            System.out.println("lol");
        }

    }
}