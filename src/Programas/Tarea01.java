package Programas;
import java.util.Scanner;
public class Tarea01 {
    public static void main(String[] args) {
        //VARIABLES
        Scanner scanner = new Scanner(System.in);
        double[][] ventas = new double[4][4];
        double totalVentas = 0;
        //ENTRADA DE DATOS
        System.out.println("Ingrese las ventas para una matriz de 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Venta [" + (i+1) + "][" + (j+1) + "]: ");
                ventas[i][j] = scanner.nextDouble(); // Leer el valor de la venta
                totalVentas += ventas[i][j]; // Sumar al total de ventas
            }
        }
        //SALIDA DE DATOS
        System.out.println("\nMatriz de Ventas:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(ventas[i][j] + "\t");
            }
        }
        System.out.println("\nTotal de Ventas: " + totalVentas);
    }
}
