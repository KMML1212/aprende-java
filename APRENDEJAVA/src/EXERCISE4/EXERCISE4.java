package EXERCISE4;
import java.util.Scanner;

public class EXERCISE4 {

	public static void main(String[] args) {
    final double tasacambio = 166.386;
System.out.println("1 euro es igual a:"+ tasacambio);

System.out.println("Ingrese el valor que quiere cambiar");
try (Scanner teclado = new Scanner(System.in)) {
	double euros = teclado.nextFloat(); 
    double pesetas = euros *tasacambio ;
    System.out.println(euros + " euros son " + pesetas + " pesetas.");
}
		    }
	}


