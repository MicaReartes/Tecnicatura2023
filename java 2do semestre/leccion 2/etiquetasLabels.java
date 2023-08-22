public class etiquetasLabels {
    public static void main(String[] args) {

        //etiqueta LABELS nos permite a las palabras break y continue ir a un un lugar especifico

        
        for (var contando = 0; contando < 7; contando++) {
            if (contando % 2 == 0) { // num pares
                System.out.println("contando = " + contando);
                break;
            }
        }
        inicio: for (var contando = 0; contando < 7; contando++) {
            if (contando % 2 != 0) { // num impares
                continue inicio;
            }
            System.out.println("contando = " + contando);
        }
    }
}
