package clasejava10;

public class ClaseJava10 {
//ejercicio 10.1
    public static void main(String[] args) {
//        var condicion = false; //o true
//        if (condicion) {
//            System.out.println("condicion verdadera"); //condicion simple
//        } else {
//            System.out.println("condicion falsa");//condicion doble
//        }
        //ejercicio 10.2
        var numero = 4;
        var numeroTexto = "num desconocido";
        if (numero == 1) {
            numeroTexto = "numero uno";
        } else if (numero == 2) {
            numeroTexto = "numero dos";
        } else if (numero == 3) {
            numeroTexto = "numero tres";
        } else if (numero == 4) {
            numeroTexto = "numero cuatro";
        } else {
            numeroTexto = "numero no encontrado";
        }
        System.out.println("numeroTexto = " + numeroTexto);    
              
    }

}
