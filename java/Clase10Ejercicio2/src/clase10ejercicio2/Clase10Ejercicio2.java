
package clase10ejercicio2;

import java.util.Scanner;

public class Clase10Ejercicio2 {
//10.5 estaciones del año con switch
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite un numero de mes: ");
        var mes = Integer.parseInt(entrada.nextLine());
        var estacion = "estacion desconocida";
        switch (mes) {
            case 1: case 2: case 3:
                estacion = "verano";
                break;
             case 4: case 5: case 6:
                estacion = "otoño";
                break;
             case 7: case 8: case 9:
                estacion = "inviero";
                break;
             case 10: case 11: case 12:
                estacion = "primavera";
                break;                        
        }
        System.out.println("estacion = " + estacion);
    }
    
}
