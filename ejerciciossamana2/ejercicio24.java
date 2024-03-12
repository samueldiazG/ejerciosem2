package ejercicio1.ejerciciossamana2;
import java.util.Scanner;
public class ejercicio24 {
    public static void main(String[] args) {
        
    
    Scanner leer = new Scanner(System.in);
    int pulg=1;
    double cm= 2.54;
    System.out.println("Ingrese la cantdad a convertir");
    int cnt=leer.nextInt();
    double convertida= cnt*cm;
    double resultado=convertida/pulg;
    System.out.println("el resultado de la conversion es "+resultado);
    
}
}