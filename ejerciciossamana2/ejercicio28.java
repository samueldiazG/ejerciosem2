package ejercicio1.ejerciciossamana2;
import java.util.Scanner;
public class ejercicio28 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("**********************");
        System.out.println("bievenido al contador");
        System.out.println("**********************");
        System.out.println("###############################################");
        System.out.println("Ingrese el numero para la cuenta Regresiva ");
        System.out.println("###############################################");
        int num= leer.nextInt();
        for (int i = num; i >= 0; i--) {
        System.out.print(i+",");
    }
    
}
}