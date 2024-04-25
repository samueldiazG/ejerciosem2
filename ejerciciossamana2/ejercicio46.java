package ejercicio1.ejerciciossamana2;
import java.util.Scanner;
public class ejercicio46 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Diguite  la distancia en millas:");
        double millas = leer.nextDouble();
        double metros = millas * 1852;
        System.out.println(millas + " millas equivalen a : " + metros + " metros"+"^"+ 2);
}
}