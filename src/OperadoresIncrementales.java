public class OperadoresIncrementales {
    public static void main(String[] args){
        //PRE INCREMENTO
        System.out.println("PRE-INCREMENTO");
        int i = 1;//valor inicial
        System.out.println("valor inicial de i = " + i);
        int j = ++i;//primero incrementa y despues se asigna
        System.out.println("j = ++i --> " + j);//imprime 2
        System.out.println("i = " + i);//imprime 2

        //POST INCREMENTO
        System.out.println("\nPOST-INCREMENTO");
        i = 1;//valor inicial
        System.out.println("valor inicial de i = " + i);
        j = i++;//primero se asigna y despues incrementa
        System.out.println("j = i++ --> " + j);//imprime 1
        System.out.println("i = " + i);//imprime 2

        //PRE-DECREMENTO
        System.out.println("\nPRE-DECREMENTO");
        i = 1;//valor inicial
        System.out.println("valor inicial de i = " + i);
        j = --i;//primero se decrementa y despues se asigna
        System.out.println("j = --i --> " + j);//imprime 0
        System.out.println("i = " + i);//imprime 0

        //POST-DECREMENTO
        System.out.println("\nPOST-DECREMENTO");
        i = 1;//valor inicial
        System.out.println("valor inicial de i = " + i);
        j = i--;//primero se asigna y despues se decrementa
        System.out.println("j = i-- --> " + j);//imprime 1
        System.out.println("i = " + i);//imprime 0

        //with --> System.out.println();
        System.out.println("\nWith --> System.out.println();");
        i=1;//valor inicial
        System.out.println("valor inicial de i = " + i);
        System.out.println("++i = " + ++i);//primero se incrementa y despues se imprime -> imprime 2
        System.out.println("i++ = " + i++);//primero se imprime y despues se incrementa -> imprime 2
        System.out.println("valor final de i = " + i);//imprime 3
    }
}