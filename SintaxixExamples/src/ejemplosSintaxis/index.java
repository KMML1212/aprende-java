package ejemplosSintaxis;

import java.util.Scanner;

public class index {

	public static void main(String[] ar) {
		// TODO Auto-generated method stub
    System.out.println("Hola BOSS Karil!!!");
    Scanner teclado = new Scanner(System.in);
    int horasTrabajadas;
    float costoHora;
    float sueldo;
System.out.print("Ingrese la cantidad de horas trabajadas por el empleado:");
    horasTrabajadas = teclado.nextInt();
    System.out.println("Ingrese ek valor de la hora:");
    costoHora = teclado.nextFloat();
    sueldo = horasTrabajadas * costoHora;
    System.out.println("El empleado debe cobrar:");
    System.out.println(sueldo);
    teclado.close();
	}
}
