public class OperadoresIncrementales {
    public static void main(String[] args){
        //PRE INCREMENTO
        System.out.println("PRE-INCREMENTO");
        int i = 1;
        System.out.println("valor inicial de i = " + i);
        int j = ++i;
        System.out.println("j = ++i --> " + j);
        System.out.println("i = " + i);

        //POST INCREMENTO
        System.out.println("\nPOST-INCREMENTO");
        i = 1;
        System.out.println("valor inicial de i = " + i);
        j = i++;
        System.out.println("j = i++ --> " + j);
        System.out.println("i = " + i);

        //PRE-DECREMENTO
        System.out.println("\nPRE-DECREMENTO");
        i = 1;
        System.out.println("valor inicial de i = " + i);
        j = --i;
        System.out.println("j = --i --> " + j);
        System.out.println("i = " + i);

        //POST-DECREMENTO
        System.out.println("\nPOST-DECREMENTO");
        i = 1;
        System.out.println("valor inicial de i = " + i);
        j = i--;
        System.out.println("j = i-- --> " + j);
        System.out.println("i = " + i);

        //with --> System.out.println();
        System.out.println("\nWith --> System.out.println();");
        i=1;
        System.out.println("valor inicial de i = " + i);
        System.out.println("++i = " + ++i);
        System.out.println("i++ = " + i++);
        System.out.println("valor final de i = " + i);
    }
}