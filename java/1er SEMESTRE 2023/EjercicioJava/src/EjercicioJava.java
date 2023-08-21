
public class EjercicioJava {

    public static void main(String[] args) {

        /*var usuario = "Mica";
        var titulo = "bromatologa";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);

        var a = 8;
        var b = 4;
        System.out.println(usuario + (a + b)); */
        //ejercicio: caracteres especiales
        var nombre = "Micaela";
        System.out.println(nombre);
        System.out.println(" "); //salto de linea
        System.out.println("Nueva linea: \n" + nombre); // \n : salto de lines
        System.out.println("tabulador: \t" + nombre); // tab genera un espacio
        System.out.println("\t. :MENU: ."); // \t se puede poner al principio, al final o al medio para generar un espacio
        // puedo poner \t\t para generar mas espacio

        //caracter de retroceso
        System.out.println("retroceso: \b" + nombre); // \b para retroceder.borra un lugar hacia atras
        //tmb se pueden poner \b\b o los que sean necesarios para borrar

        //comillas simples y dobles
        System.out.println("comillas simples: \'" + nombre + "\'");
        System.out.println("comillas dobles: \"" + nombre + "\"");

    }

}
