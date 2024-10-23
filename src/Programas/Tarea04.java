package Programas;
import java.util.Scanner;
import java.util.Random;
public class Tarea04 {
    public static void main(String[] args) {
        //VARIABLES
        Random random = new Random();
        double[][] ventas = new double[3][3];
        double totalVentas = 0;
        int totalElementos = 3 * 3;
        //PROCESO DE DATOS
        System.out.println("Matriz de Ventas Aleatorias:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ventas[i][j] = 1000 + random.nextDouble() * (10000 - 1000);
                System.out.print(String.format("%.2f", ventas[i][j]) + "\t");
            }
        }
        double promedioVentas = totalVentas / totalElementos;
        //SALIDA DE DATOS
        System.out.println("\nTotal de Ventas: " + String.format("%.2f", totalVentas));
        System.out.println("Promedio de Ventas: " + String.format("%.2f", promedioVentas));
    }
}
