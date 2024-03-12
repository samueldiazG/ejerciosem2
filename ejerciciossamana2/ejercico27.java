package ejercicio1.ejerciciossamana2;
import java.util.Scanner;
public class ejercico27 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese su nombre");
        String nom = leer.nextLine();
        System.out.println("ingrese su genero");
        char genr = leer.next().charAt(0);
        if (genr == 'M' || genr == 'm') {
            System.out.println("Bienvenido " + nom);
        } else if (genr == 'F' || genr == 'f') {
            System.out.println("Bienvenida " + nom);
        } else {
            System.out.println("hola niñ@ sin padre, indeciso de mrd ");
            System.out.println("resuelve tus problemas con tu psiquiatra");
        }
    }
}

