public class ExampleString {
    public static void main(String[] args) {
        /*Java divide la memoria en zonas:
        Stack — variables locales y primitivos, memoria pequeña y rápida
        Heap — objetos creados con new, memoria grande y dinámica
        String Pool — zona especial dentro del Heap donde Java reutiliza Strings iguales, exclusiva para Strings literales*/

        boolean valorLogico;
        String str1 = "Cadena 1";//Instancia de manera automatica (de manera implicita) //de referencia al String PooL
        String str2 = "Cadena 2";//Instancia de manera automatica (de manera implicita) //de referencia al String PooL
        String str3 = "Cadena 1";//Instancia de manera automatica (de manera implicita) //de referencia al String PooL
        String str4 = new String("CaDEna 1");//NEW Instancia generada de manera manual (de manera explicita) //de referencia al Heap

        /*Las variables String que se crean de manera implicita, si almacenan la misma cadena, sus referencias apuntan a una misma
        instancia(memoria) y no generan una New Instancia(new memoria) --> (caso de variables str1 & str3), pero si se crean
        de manera explicita (NEW INSTANCIA --> new memoria) entonces, aunque almacenen la misma cadena, sus referencias apuntan a instancias(memorias)
        completamente distintas --> (caso de variables str1 & str4). Si las varaibles de tipo String se crean de manera implicita y
        ambas almacenan diferentes cadenas, sus referencias apuntaran a instancias(memorias) diferentes--> (caso de variables str1 & str2).*/

        valorLogico = (str1 == str3);/*Al usar == con String, comparas si ambas referencias apuntan a la misma
                                       instancia(memoria), en este caso str1 y str3 se crean de manera implicita y
                                       almacenan la misma cadena por lo que son dos referencias que apuntan a una misma
                                       instancia(memoria) por lo tanto sera true*/
        System.out.println("str1 == str3: " + valorLogico);

        valorLogico = (str1 == str4);/*Al usar == con String, comparas si ambas referencias apuntan a la misma
                                       instancia(memoria), en este caso ambas referencias apuntan a instancias distintas,
                                       str1 se crea de manera implicita y str4 de manera explicita(New Instancia --> new memoria)
                                       por lo tanto es false*/
        System.out.println("str1 == str4: " + valorLogico);

        valorLogico = (str1 == str2);/*Al usar == con String, comparas si ambas referencias apuntan a la misma
                                       instancia(memoria),en este caso aunque ambas variables se crean de manera implicita
                                       almacenan cadenas diferentes por lo que sus referencias apuntan a instancias(memorias)
                                       distintas, por lo tanto sera false*/
        System.out.println("str1 == str2: " + valorLogico);

        valorLogico = str1.equals(str3);// Con .equals() se comparan las cadenas (Estas tienen que ser obligatoriamente igual Mayusculas y Minusculas)
        System.out.println("str1.equals(str3) = " + valorLogico);
        valorLogico = str1.equalsIgnoreCase(str4);//Con .equalsIgnoreCase() se comparan las cadenas sin importar Mayusculas y Minusculas
        System.out.println("str1.equalsIgnoreCase(str4) = " + valorLogico);
        valorLogico =  str1.equalsIgnoreCase(str2);//Con .equalsIgnoreCase() se comparan las cadenas sin importar Mayusculas y Minusculas
        System.out.println("str1.equalsIgnoreCase(str2) = " + valorLogico);
    }
}
