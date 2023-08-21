import java.util.Scanner;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float micaela,juan,sol,total;
        System.out.println("digite la cantidad de dinero de Micaela: ");
        micaela = Float.parseFloat(entrada.nextLine());
        
        juan = micaela / 2;
        sol = (juan + micaela)/ 2;
        total = juan + micaela + sol;
        System.out.println("\nEl dinero de juan es: US$"+juan);
        System.out.println("El dinero de sol es: US$"+sol);
        System.out.println("El dinero total de los tres es: US$" +total);        
    }    
}
