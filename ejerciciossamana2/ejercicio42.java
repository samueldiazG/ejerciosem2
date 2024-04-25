package ejercicio1.ejerciciossamana2;
import java.util.Scanner;
public class ejercicio42 {
    public static void main(String[] args) {
        
    Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los voltios necesarios para el sistema de iluminación:");
        double voltios = leer.nextDouble();
        double vn = 0.05;
        int naranjasNecesarias = (int) (voltios / vn);
        double toneladasNaranjas = naranjasNecesarias * 0.006 / 1000;
        System.out.println("Se necesitaran " + naranjasNecesarias + " naranjas para realizar el trabajo deseado.");
        System.out.println("Esto equivale a aproximadamente " + toneladasNaranjas + " toneladas.");
    }
}

