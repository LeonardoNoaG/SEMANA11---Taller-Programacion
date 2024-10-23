package Programas;
import java.util.Scanner;
import java.util.Random;
public class Tarea03 {
    public static void main(String[] args) {
        //VARIABLES
        Random random = new Random();
        double[][] ventas = new double[4][4];
        double ventaMayor = Double.MIN_VALUE;
        double ventaMenor = Double.MAX_VALUE;
        //PROCESO DE DATOS
        System.out.println("Matriz de Ventas Aleatorias:");
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                ventas[i][j] = 10 + random.nextDouble() * (5000 - 10);
                System.out.print(String.format("%.2f", ventas[i][j]) + "\t");
                if (ventas[i][j] > ventaMayor){
                    ventaMayor = ventas[i][j];
                }
                if (ventas[i][j] < ventaMenor){
                    ventaMenor = ventas[i][j];
                }
            }
        }
        //SALIDA DE DATOS
        System.out.println("\nVenta Mayor: "+ String.format("%.2f", ventaMayor));
        System.out.println("Venta Menor: "+ String.format("%.2f", ventaMenor));
    }
}
