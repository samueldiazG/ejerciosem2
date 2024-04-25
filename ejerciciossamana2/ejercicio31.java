package ejercicio1.ejerciciossamana2;
import java.util.Scanner;
public class ejercicio31 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese la base en milimetros del triangulo");
    int bs = leer.nextInt();
    System.out.println("Ingrese la altura en milimetros del triangulo ");
    int al = leer.nextInt();
    double bsencm = bs/10;
    double alenmtr = al/1000;
    double area = bs*al;
    System.out.println("El area del triangulo es:"+area);
    System.out.println("la base es de :"+bsencm);
    System.out.println("la altura es de "+alenmtr+"^"+2);
    }
}
