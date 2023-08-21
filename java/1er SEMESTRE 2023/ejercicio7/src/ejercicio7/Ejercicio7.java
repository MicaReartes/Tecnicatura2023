package ejercicio7;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int salario = 1000;
        int comision = 150, venta;
        float PrecioTotal, salarioMensual, ventaCarro, porcVenta;

        System.out.println("digite la cantidad de carros vendidos: ");
        venta = Integer.parseInt(entrada.nextLine());
        System.out.println("digite el precio de un carro: ");
        ventaCarro = Float.parseFloat(entrada.nextLine());

        comision *= venta;
        PrecioTotal = ventaCarro * venta;
        porcVenta = PrecioTotal * 0.05f;
        salarioMensual = salario + comision + porcVenta;

        System.out.println("\nEl salario mensual es: " + salarioMensual);
        
    }
    
}
