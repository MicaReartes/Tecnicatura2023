// ingresamos OVERVIEW JAVA para buscar clases, buscamos : Class JOptionPane
        // https://docs.oracle.com/javase/8/docs/api/index.html?overview-summary.html

        /*
         * EJERCICIO 1
         * leer un numero y mostrar su cuadrado, repetir el proceso hasta que se
         * introduzca un num negativo
         */


import javax.swing.JOptionPane;

public class ejercicioSINSCANNER {
    public static void main(String[] args) {        
        int numero, cuadrado;
        numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
        while (numero >= 0) { // mientras el numero sea igual a cero o positivo
            cuadrado = (int) Math.pow(numero, 2);
            System.out.println("el numero " + numero + " elevado alcuadrado es: " + cuadrado);
            numero = Integer.parseInt(JOptionPane.showInputDialog("digite otro numero"));

        }
        System.out.println("el programa ha finalizado por numero negativo");
    }
}