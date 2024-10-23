package Programas;
import java.util.Scanner;
public class Programa01 {
    public static void main(String[] args){
        //VARIABLES
        Scanner lectura = new Scanner(System.in);
        int sp, ci, r, numero, c, f;
        int [][] mnumeros = new int [3][3];
        //ENTRADA DE DATOS
        for(f=0;f<mnumeros[0].length;f++){
            for(c=0;c<mnumeros[0].length;c++){
                System.out.print("Ingresar numero");
                numero = lectura.nextInt();
                mnumeros[f][c]=numero;
            }
        }
        //PROCESO
        sp = 0;
        ci = 0;
        for(f=0;f<mnumeros[0].length;f++){
            for(c=0;c<mnumeros[0].length;c++){
                r = mnumeros[f][c]%2;
                if(r==0){
                    sp+=mnumeros[f][c];
                }else{
                    ci++;
                }
            }
        }
        //SALIDA
        System.out.println("La suma de los numeros pares es: " +sp);
        System.out.println("La suma de numeros impares es: " +ci);
    }
}
