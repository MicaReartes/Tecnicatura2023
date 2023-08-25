/*EJERCICIO2: con JOptionPane
         * leer un num e identificar si es positivo o negativo. El proceso se reptira
         * hasta que se introduzca cero
         */

import javax.swing.JOptionPane;

public class ejercicio02SinScanner {
    public static void main(String[] args) {

        var numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
        while (numero != 0) {
            if (numero > 0) {
                JOptionPane.showInputDialog(null, "el numero " + numero + " es positivo");
            } else {
                JOptionPane.showInputDialog(null, "el numero " + numero + " es negativo");
            }

            numero = Integer.parseInt(JOptionPane.showInputDialog("digite otro numero"));
        }
        JOptionPane.showInputDialog(null, "el numero " + numero + " finaliza el programa");
    }
}