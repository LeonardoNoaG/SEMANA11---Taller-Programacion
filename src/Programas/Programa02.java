package Programas;
import java.util.Scanner;
public class Programa02 {
    public static void main(String[]args){
        int numero=0,f,c,cem;
        double promedio=0.0,suma=0.0;
        int[][]mnumero=new int[3][3];
        Scanner lectura=new Scanner(System.in);   
        //ENTRADA DE DATOS
        for ( f = 0; f < mnumero[0].length; f++) {
            for ( c = 0; c < mnumero[0].length; c++) {
                System.out.print("ingrese el numero : ");
                numero=lectura.nextInt();
                mnumero[f][c]=numero;    
             }
        }
        //PROCESO DE DATOS
        for ( f = 0; f < mnumero[0].length; f++) {
            for ( c = 0; c < mnumero[0].length; c++) {
                suma+=mnumero[f][c];
            }
        }
        cem=mnumero.length*mnumero[0].length;
        promedio=suma/cem;
        //SALIDA DE DATOS
        System.out.println("La suma dde los numeros es : "+suma);
        System.out.println("El promedio de los numeros es : "+promedio);
    }
}
