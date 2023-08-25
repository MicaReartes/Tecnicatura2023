/*
         * EJERCICIO 1
         * leer un numero y mostrar su cuadrado, repetir el proceso hasta que se
         * introduzca un num negativo
         */
        
        
import java.util.Scanner;

public class ejercicioCiclos01 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int numero, cuadrado;
        System.out.println("digite un numero: ");
        numero = Integer.parseInt(entrada.nextLine()); // PARA QUE EL USUARIO ESCRIBA
        while (numero >= 0) { // mientras el numero sea igual a cero o positivo
            cuadrado = (int) Math.pow(numero, 2);
            System.out.println("el numero " + numero + " elevado alcuadrado es: " + cuadrado);
            System.out.println("digite otro numero");
            numero = Integer.parseInt(entrada.nextLine());

        }
        System.out.println("el programa ha finalizado por numero negativo");
    }
}