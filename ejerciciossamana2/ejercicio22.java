package ejercicio1.ejerciciossamana2;
import java.util.Scanner;
public class ejercicio22 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el el numero ");
        double num = leer.nextInt();
        int parteentera = (int) num;
        double decinum = num / 100;
        System.out.println("parte entera del dato proporcionado: "+parteentera);
        System.out.println("su parte decimal es :"+decinum);
    }
    
}
