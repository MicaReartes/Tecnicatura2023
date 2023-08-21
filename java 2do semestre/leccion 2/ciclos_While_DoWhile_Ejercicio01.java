public class ciclos_While_DoWhile_Ejercicio01{
    public static void main(String[] args) {
        var conteo = 0; // inferencia de tipos

        //CICLO WHILE (EN PSEINT mientras-hacer. primero esta la condicion, si no se cumple, no se accede al codigo )

        while (conteo < 7) {
            System.out.println("conteo = " + conteo);
            conteo++; // vamos aumentando en uno la variable
        }

        //CICLO DO WHILE(en PSEINT repetir-hasta que. primero ejecuta el codigo de su interior y luego hace la comrpobacion de la condicion. en este ciclo sabemos que por lo menos una vez se ejecuta su codigo y si la condicion es verdadera vuelve a repetir hasta que se FALSA y sale del ciclo)

        var contador = 0;
        do{
            System.out.println("contador = " + contador);
            contador++; //para que no se vuelva un ciclo infinito
        }while(contador <= 7); //poner punto y coma
    }
}