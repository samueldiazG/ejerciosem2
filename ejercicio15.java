package ejercicio1;
import java.util.Scanner;
public class ejercicio15 {
    public static void main(String[] args) {
        
    
    Scanner leer = new Scanner(System.in);
    System.out.println("ingrese la edad de la persona ");
    byte edad = leer.nextByte();
    if (edad<18) {
        System.out.println("la persona es menor de edad ");
        
    } else {
        System.out.println("la persona es mayor de edad");
        
    }
    }
}