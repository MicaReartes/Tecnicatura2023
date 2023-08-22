public class palabraBreackYContinue {
    public static void main(String[] args) {        
        for( var contando = 0; contando < 7 ; contando++){ 
            if(contando % 2 == 0){ //num pares
            System.out.println("contando = " + contando);
            break; //a penas encuentra la posicion que da cero, que cumple con la condicion de ser numero par, recorre el cilo y llega a la palabra breack y rompe el ciclo. por eso la ejecucion muestra solo el CERO 
            }
        }

        for( var contando = 0; contando < 7 ; contando++){ 
            if(contando % 2 != 0){ //num impares
                 continue; //vamos a la siguiente iteracion, el cilclo empieza a correr, y al encontrar el primer numero impar, le pide que siga al siguiente, pero solo imprime los PAR
            }
            System.out.println("contando = " + contando);
        }
    }
}
