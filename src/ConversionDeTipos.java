import javax.lang.model.SourceVersion;

public class ConversionDeTipos {
    public static void main(String[] args){
        //Cadenas a primitivos
        String numeroStr = "123";
        System.out.println("numeroStr = " + numeroStr);
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        String realStr = "1234.5E-3"; //1.2345
        System.out.println("\nrealStr = " + realStr);
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicoStr = "true";
        System.out.println("\nlogicoStr = " + logicoStr);
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        //primitivos a cadenas
        int numeroInt2 = 100;
        System.out.println("\nnumeroInt2 = " + numeroInt2);
        String numeroStr2 = Integer.toString(numeroInt2);//--> Uso de Clase Integer --> String
        System.out.println("numeroStr2 = " + numeroStr2);
        numeroStr2 = String.valueOf(numeroInt2+10);//--> Uso de clase String --> String
        System.out.println("numeroStr2 = " + numeroStr2);

        double realDouble2 = 98765432.1E-3;
        System.out.println("\nrealDouble2 = " + realDouble2);
        String realStr2 = Double.toString(realDouble2);//Uso de clase Double --> String
        System.out.println("realStr2 = " + realStr2);
        realStr2 = String.valueOf(realDouble2);//Uso de clase String --> String
        System.out.println("realStr2 = " + realStr2);

        //Conversion entre tipos primitivos
        System.out.println("\nValor maximo del int: " + Integer.MAX_VALUE);
        System.out.println("Valor maximo del short: " + Short.MAX_VALUE);
        System.out.println("Valor maximo del long: " + Long.MAX_VALUE);
        System.out.println("Valor maximo del float: " + Float.MAX_VALUE);
        //Valor maximo del int: 2147483647
        //Valor minimo del short: 32767
        int entero1 = 32767;
        System.out.println("\nentero1 = " + entero1);
        int entero2 = 2147483647;
        System.out.println("entero2 = " + entero2);

        short s1 = (short)entero1; //-->Cast para forzar la conversion
        System.out.println("\nshort1 <-- entero1 (32767) = " + s1 + " //Cast para forzar la conversion");
        short s2 = (short)entero2; /* --> Cast para forzar la conversion (perdida de informacion
                                  cuando el int es mas grande que el valor que soporta el short)*/
        System.out.println("short2 <-- entero2 (2147483647) = " + s2 + " //perdida de informacion" + " //Cast para forzar la conversion");
        long l = entero2; /* --> Sin Cast ya que el MAX_VALUE de int cabe en long sin problemas*/
        System.out.println("long <---- entero2 (2147483647) = " + l);
        float f = entero2;
        System.out.println("float <--- entero2 (2147483647) = " + f);
        double d = entero2;
        System.out.println("double <-- entero2 (2147483647) = " + d);

        int intRecuperacionDeShort1 = s1;
        System.out.println("\nintRecuperacion <-- Short1 = " + intRecuperacionDeShort1);
        int intRecuperacionDeShort2 = s2;
        System.out.println("intRecuperacion <-- Short2 = " + intRecuperacionDeShort2 + "//Perdida de Informacion");
        int intRecuperacionDelLong = (int)l;//Cast para forzar la conversion
        System.out.println("intRecuperacion <-- long = " + intRecuperacionDelLong + " //Cast para forzar la conversion");
        int intRecuperacionDeFloat = (int)f;//Cast para forzar la conversion
        System.out.println("intRecuperacion <-- float = " + intRecuperacionDeFloat + " //Cast para forzar la conversion");
        int intRecuperacionDeDouble = (int)d;//Cast para forzar la conversion
        System.out.println("intRecuperacion <-- double = " + intRecuperacionDeDouble + " //Cast para forzar la conversion");
    }
}
