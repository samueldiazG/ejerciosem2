package ejercicio1.ejerciciossamana2;
import java.util.Scanner;
public class ejercicio21 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a, b;
        System.out.println("ingrese el valor de a ");
        a = leer.nextInt();
        System.out.println("ingrese el valor de b ");
        b = leer.nextInt();
        int temp = a;
        a = b;
        b=temp;
        System.out.println("la variable ha sido cambiada: "+a);
        System.out.println("La variable es cambiada por: "+b);

    }
    
}
