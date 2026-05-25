public class PrimitivosBoolean {
    public static void main(String[] args) {

        //VARIABLES
        double realDouble = 2222.22E-3;
        float realFloat = 1111.11E-3F;
        boolean condicion;

        condicion = (realDouble < realFloat);

        System.out.println("realDouble = " + realDouble);
        System.out.println("realFloat = " + realFloat);
        System.out.println("realDouble < realFloat = " + condicion);
    }
}
