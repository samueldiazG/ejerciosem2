package ejercicio1;
import java.util.Scanner;
public class ejerciccio16 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la nota del estudiante");
        double nt= leer.nextDouble();
        if (nt<=3.0) {
            System.out.println("el estudiante gano el examen");
            
        } else {
            System.out.println("el estudiante no paso el examen ");
            
        }
    }
    
}
