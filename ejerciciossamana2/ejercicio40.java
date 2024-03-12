package ejercicio1.ejerciciossamana2;
import java.util.Scanner;
public class ejercicio40 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese los kilos a convertir:");
    double kOro = leer.nextDouble();
    System.out.println("Digite el precio en pesos por onza de oro:");
    double OnzaOro = leer.nextDouble();
    double groro = kOro * 1000;
    double onzasOro = groro / 28.3495;
    double Total = onzasOro * OnzaOro;
    System.out.println(kOro + " kilos de oro equivalen a $" + Total + " pesos.");

}
}
