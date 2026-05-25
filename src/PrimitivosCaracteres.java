public class PrimitivosCaracteres {
    public static void main(String[] args) {
        //VARIABLES
        char caracter1 = '@'; //Unicode --> \u0040 --> @
        char caracter2 = '\u0040'; //@
        char espacio = '\u0020';
        char tabulador = '\t'; //tabulacion
        char borrar = '\b'; //back space
        char nuevaLinea = '\n'; //new line
        char retornoCarro = '\r'; //clean line

        if(caracter1==caracter2) {
            System.out.println("caracter1 = " + caracter1);
            System.out.println("caracter2 = " + caracter2);
            System.out.println("Hola"+espacio+"Mundo1");
            System.out.println("Hola"+tabulador+"Mundo2");
            System.out.println("Hola"+borrar+"Mundo3");
            System.out.println("Hola"+nuevaLinea+"Mundo4");
            System.out.println("Hola"+retornoCarro+"Mundo5");
            System.out.println();

            System.out.println("Tipo char corresponde en byte a " + Character.BYTES);
            System.out.println("Tipo char corresponde en bites a " + Character.SIZE);
            System.out.println("Valor maximo de un char: " + Character.MAX_VALUE);
            System.out.println("Valor minimo de un char: " + Character.MIN_VALUE);
            System.out.println();
        }
    }
}
