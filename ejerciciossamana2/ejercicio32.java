package ejercicio1.ejerciciossamana2;
import java.util.Scanner;
public class ejercicio32 {
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese la longitud del primer lado");
        int prime = leer.nextInt();
        System.out.println("Ingresa la longitud del segundo lado");
        int segla = leer.nextInt();
        double prime2 = Math.pow(prime,2);
        double segla2 = Math.pow(segla,2);
        double area= prime2+segla2;
        System.out.println("el area es "+area);
        double cm = area*100;
        System.out.println("el area en centimetros es "+cm);
        double milimetros = area*1000;





    }
    
}
