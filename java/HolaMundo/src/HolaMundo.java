// ctrl + S para guardar
public class HolaMundo {
    public static void main(String[] args) {//se abrevia con psvm + tab -- metodo MAIN, la regla es que la variable no puede ser utilizada fuera de este metodo
        System.out.println("hola mundo desde java"); //se abrevia con sout + tab
        
        int miVariable = 10;//int para definir la variable primitivo entero
        System.out.println(miVariable); //respetar mayusculas y minusculas
        //reutilizar variables:
        miVariable = 5;
        System.out.println(miVariable);
        
        //tipo de varible String (no es del tipo primitivo)
        String miVariableCadena = "Bienvenidos"; //variable de tipo cadena y tiene privilegios
        System.out.println(miVariableCadena);  //ctrl + espacio para autocompletar
        //reutilixar la variable cadena
        miVariableCadena = "sigamos creciendo en programacion";
        System.out.println(miVariableCadena); //ctrl + clik izq sobre la variable nos lleva a donde fue creada
        
        var miVariableEntera2 = 10;
        var miVariableCadena2 = "seguimos estudiando";
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        //soutv + tab
        System.out.println("miVariableEntera2 = " + miVariableEntera2);
        
        //reglas para definir variables en java
        //se recomienda empezar con miniscula
        //no se pueden utilizar numeros como primer caracter de la variable
        //no puede tener caracteres especiales
        //si puede tener _
        //se puede usar $
        //se puede usar acentos pero no es recomedable
        //no se acepta y es ilegal usar #
        
        var miVariableEjemplo = 45;
        
    }
}
