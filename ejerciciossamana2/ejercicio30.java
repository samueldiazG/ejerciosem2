package ejercicio1.ejerciciossamana2;
import java.util.Scanner;
public class ejercicio30 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la distancia km");
        int km = leer.nextInt();
        int metros = km*1000;
        System.out.println("la longitud expresada en metros es de "+ metros);
    }
}
