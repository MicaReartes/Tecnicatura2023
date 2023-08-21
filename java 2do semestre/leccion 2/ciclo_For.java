public class ciclo_For {
    public static void main(String[] args) {
        /*CICLO FOR (PARA en pseint): este maneja un numero determinado de iteraciones a diferencia de los ciclos while y do-while que manejan un numero Indeterminado de iteraciones. este ciclo tiene una condicion que se debe revisar, si es verdadera se ejecuta el codigo dentro del ciclo. si es falsa no ejecuta nada dentro del ciclo.
        cuando la condicion se cumple este comienza de incremento a incremento hasta que la condicion sea falsa y sale del ciclo
        */
        for( var contando = 0; contando < 7 ; contando++){ 
            /*sintaxis: dentro del parentesis 3 lugares: 
            -en el primer lugar: para declarar(crear) la variable de tipo contador o iterador la cual se va a incrementar (se le puede hacer inferencia de tipo)
            -en el segundo lugar: la condicion a cumplir
            -en el tercer lugar: el incremento a incremento
            */
            System.out.println("contando = " + contando);
        }
    }
}
