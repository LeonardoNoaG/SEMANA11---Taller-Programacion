package Programas;
import java.util.Scanner;
public class Tarea02 {
    public static void main(String[] args) {
        //VARIABLES
        Scanner scanner = new Scanner(System.in);
        double[][] compras = new double[4][4];
        double totalCompras = 0;
        int totalElementos = 4 * 4;
        //ENTRADA DE DATOS
        System.out.println("Ingrese las compras para una matriz de 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Compra [" + (i+1) + "][" + (j+1) + "]: ");
                compras[i][j] = scanner.nextDouble();
                totalCompras += compras[i][j];
            }
        }
        double promedioCompras = totalCompras / totalElementos;
        //SALIDA DE DATOS
        System.out.println("\nMatriz de Compras:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(compras[i][j] + "\t");
            }
        }
        System.out.println("\nTotal de Compras: " + totalCompras);
        System.out.println("Promedio de Compras: " + promedioCompras);
    }
}
