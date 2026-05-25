public class PrimitivosFloat {
    public static void main(String[] args){

        float realFloat = 3.4028235E38F;
        System.out.println("realFloat = " + realFloat);
        System.out.println("Tipo float corresponde en byte a " + Float.BYTES);
        System.out.println("Tipo float corresponde en bites a " + Float.SIZE);
        System.out.println("Valor maximo de un float: " + Float.MAX_VALUE);
        System.out.println("Valor minimo de un float: " + Float.MIN_VALUE);
        System.out.println();

        double realDouble = 3.4028235E39;
        System.out.println("realDouble = " + realDouble);
        System.out.println("Tipo double corresponde en byte a " + Double.BYTES);
        System.out.println("Tipo double corresponde en bites a " + Double.SIZE);
        System.out.println("Valor maximo de un double: " + Double.MAX_VALUE);
        System.out.println("Valor minimo de un double: " + Double.MIN_VALUE);
        System.out.println();

    }
}
