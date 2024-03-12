package ejercicio1.ejerciciossamana2;
import java.util.Scanner;
public class ejercico25 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la temperatura ");
        int temp= leer.nextInt();
        int farent = temp*9;
        int farentp2=farent/5;
        int resultadodeconvercion = farentp2+35;
        System.out.print("la temperatura en grados fahrenheites es :"+resultadodeconvercion);
    }
}
