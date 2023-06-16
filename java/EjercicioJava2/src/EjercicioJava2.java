
import java.util.Scanner;

//si este cartelito no aparece, "Scanner" nos va a salir subrallado, y aparecera un foquito
//en el margen izquiero, al precionarlo nos va a permitir seleccionar la opcion de IMPORTAR la clase
public class EjercicioJava2 {

    public static void main(String[] args) {
        //clase Scanner
        /*  Scanner entrada = new Scanner(System.in);//Es necesario IMPORTAR  esta clase ya que se encuentra definida en otra parte de las clases en java
        //las clases las vamos a clasificar y empaquetar en FOULDERS (paquetes o carpetas)
        //esta clase se encuentra en un paquete llamado java.util.scanner
        System.out.println("digite su nombre: ");
        var usuario = entrada.nextLine(); //lee una linea completa de la consola. detiene la ejecucion para que el usuario escribs y de enter
        System.out.println("usuario = " + usuario); //soutv
        System.out.println("escribir el titulo: ");
        var titulo = entrada.nextLine();
        System.out.println("resultado: " + titulo + " " + usuario); 

        byte numEnteroByte = 10;
        System.out.println("valor minimo del Byte:" + Byte.MIN_VALUE);
        System.out.println("valor maximo del Byte:" + Byte.MAX_VALUE);

        System.out.println(" ");

        Short numEnteroShort = 10;
        System.out.println("numEnteroShort = " + numEnteroShort);
        System.out.println("valor min del short" + Short.MIN_VALUE);
        System.out.println("valor max del short" + Short.MAX_VALUE);

        System.out.println(" ");

        int numEnteroInt = 10;
        System.out.println("numEnteroInt = " + numEnteroInt);
        System.out.println("valor min del Int:" + Integer.MIN_VALUE);
        System.out.println("valor max del int:" + Integer.MAX_VALUE);

        System.out.println(" ");

        long numEnteroLong = 10;
        System.out.println("numEnteroLong = " + numEnteroLong);
        System.out.println("valor min del Long:" + Long.MIN_VALUE);
        System.out.println("valor max del long:" + Long.MAX_VALUE);

        System.out.println(" ");

        float numFloat = 3.45F;
        System.out.println("numFloat = " + numFloat);
        System.out.println("valor min del Float:" + Float.MIN_VALUE);
        System.out.println("valor max del Float:" + Float.MAX_VALUE);

        System.out.println(" ");

        double numDouble = 10;
        System.out.println("numDouble = " + numDouble);
        System.out.println("valor min del Double:" + Double.MIN_VALUE);
        System.out.println("valor max del Double:" + Double.MAX_VALUE);
        
        //inferencia de tipos var y tipos primitivos
        
        var numEntero = 20; //las literales sin punto automaticamente son de tipo int
        System.out.println("numEntero = " + numEntero);
        //el punto de reptura se debe poner en una parte de codigo valida
        
        var numFLoat = 10.0F; //automaticamente con el punto se tranforma en double
        System.out.println("numFLoat = " + numFLoat);
        
        var numDouble = 10.0;
        System.out.println("numDouble = " + numDouble);

        //tipos primitivos char
        char miVariableChar = 'a';
        System.out.println("miVariableChar = " + miVariableChar);

        //list unicode google
        char varCaracter = '\u0024';//indicamos a java la asignacion con el codigo unicode "$"
        System.out.println("varCaracter = " + varCaracter);
        char varCaracterDecimal = 36; //valor decimal del codigo unicode "$"
        System.out.println("varCaracterDecimal = " + varCaracterDecimal);
        char varCaracterSimbolo = '$';
        System.out.println("varCaracterSimbolo = " + varCaracterSimbolo);

        var varCaracter1 = '\u0024';//indicamos a java la asignacion con el codigo unicode "$"
        System.out.println("varCaracter1 = " + varCaracter1);
        var varCaracterDecimal1 = (char) 36; //lo toma como valor entero y le asigna un tipo int. le agregamo (char)
        System.out.println("varCaracterDecimal1 = " + varCaracterDecimal1);
        var varCaracterSimbolo1 = '$';
        System.out.println("varCaracterSimbolo1 = " + varCaracterSimbolo1);

        int varEnteroChar = '$'; //muestra el valor decimal asociado al simbolo
        System.out.println("varEnteroChar = " + varEnteroChar);
        int caracterChar = 'b';
        System.out.println("caracterChar = " + caracterChar);

        //tipos primitivos tipos booleanos
        boolean varBool = true;
        System.out.println("varBool = " + varBool);

        if (varBool) {           //NO OLVIDAR LAS LAS LLAVES {}
            System.out.println("la bandera es verde");
        } else {
            System.out.println("la bandera es roja");
        }
        boolean varBool1 = false;
        System.out.println("varBool1 = " + varBool1);

        if (varBool1) {           //NO OLVIDAR LAS LAS LLAVES {}
            System.out.println("la bandera es verde");
        } else {
            System.out.println("la bandera es roja");
        }

        //algoritmo: es mayor de edad?
        var edad = 15; //literal tener presente la inferencia de tipos
        //var Adulto = edad >= 18; //esta expresion es booleana
        if (edad >= 18) { //acorta la estructura
            System.out.println("eres mayor de edad");
        } else {
            System.out.println("eres menor de edad");
        }
        
        //conversion de tipos primitivos
        var edad = Integer.parseInt("20"); //para convertir un dato de tipo string a un dato entero
        System.out.println("edad = " + (edad+1));
        var valorPi = Double.parseDouble("3.1416");
        System.out.println("valorPi = " + valorPi);

//        pedir un valor
        var entrada = new Scanner(System.in);
//        System.out.println("digite su edad: ");
//        edad = Integer.parseInt(entrada.nextLine());
//        System.out.println("edad = " + edad);

        //conversion de tipos primitivos en java parte 2
        var edadTexto = String.valueOf(10);  //para convertir un dato entero a tipo string
        System.out.println("edadTexto = " + edadTexto);

        var FraseChar = "programadores".charAt(3); //el num de indice corresponde a cada posicion de la cadena "3->g"
        System.out.println("FraseChar = " + FraseChar);

        System.out.println("digite un caracter: ");
        FraseChar = entrada.nextLine().charAt(0);
        System.out.println("FraseChar = " + FraseChar);
        
        int num1 = 5, num2 =4; //asignacion e inicializacion de varias variables
        var solucion = num1 + num2;
        System.out.println("solucion de la suma = " + solucion);

        solucion = num1 - num2;
        System.out.println("solucion de la resta = " + solucion);

        solucion = num1 * num2;
        System.out.println("solucion de la multiplicacion = " + solucion);

        solucion = num1 / num2;
        System.out.println("solucion de la division = " + solucion); //num entero, resultado sin coma
        
        var solucion2 = 3.4 / num2; //inferencia de tipo para que tome en cuenta la coma. java automaticamente le asigno tipo double
        System.out.println("solucion2 de la division = " + solucion2);
        
        //residuo entero de la division:
        solucion = num1 % num2;
        System.out.println("solucion del residuo = " + solucion);
        
        if (num1 % 2 == 0) //solo una linea de lectura, no hace falta poner llaves {}
         System.out.println("es un num par");
        else
         System.out.println("es numero impar");*/
        
        int varNum1 = 1, varNum2 = 4;
        int varNum3 = varNum1 + 6 - varNum2;
        System.out.println("varNum3 = " + varNum3);

//operador de composicion:
        varNum1 += 1; //varNum1 = varNum1 + 1
        System.out.println("varNum1 = " + varNum1);
         varNum1 -= 4; //varNum1 = varNum1 - 1
        System.out.println("varNum1 = " + varNum1);
         varNum1 *= 6; //varNum1 = varNum1 * 1
        System.out.println("varNum1 = " + varNum1);
         varNum1 /= 5; //varNum1 = varNum1 / 1
        System.out.println("varNum1 = " + varNum1);
        
       

        
    }
}


