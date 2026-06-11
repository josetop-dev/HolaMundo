public class ExampleStringMethodsArrays {
    public static void main(String[] args) {
        String text = "  hola mundo ";
        System.out.println("text = " + text);
        System.out.println("text.length() = " + text.length());//.length() es un metodo en String -> retorna el largo del String
        System.out.println("text.toCharArray() = " + text.toCharArray());//imprime la referencia de la instancia
        char[] charArray = text.toCharArray();//.toCharArray convierte un String en un arreglo de caracteres de tipo char
        System.out.println("charArray.length = " + charArray.length);//.length es un atributo o propiedad del arreglo -> retorna el largo del arreglo
        for(int i = 0; i< charArray.length; i++){
            System.out.println("charArray " + i + " = " + charArray[i]);
        }//A travez de una iteracion muestra cada uno de los elementos que se encuestran dentro del arreglo
        System.out.println("text.split(\"o\") = " + text.split("o"));//imprime la referencia de la instancia
        String[] strArray = text.split("o");//.split convierte un String en un arreglo de tipo String bajo un parametro
        System.out.println("strArray.length = " + strArray.length);//.length es un atributo o propiedad del arreglo -> retorna el largo del arreglo
        for(int j = 0; j< strArray.length;j++){
            System.out.println("strArray = "  + j + " = " + strArray[j]);
        }//A travez de una iteracion imprime cada uno de los elementos que se encuentran dentro del arreglo
        String text2 = "Hola.Mundo.Desde.Java";
        System.out.println("\ntext2 = " + text2);
        System.out.println("text2 = " + text2.length());//.length() es un metodo en String -> retorna el largo del String
        System.out.println("text2.split(\"\\\\.\") = " + text2.split("\\."));//imprime la referencia de la instancia
        String[] strArray2 = text2.split("\\.");//.split convierte un String en un arreglo de tipo String bajo un parametro
        System.out.println("strArray2.length = " + strArray2.length);//.length es atributo o propiedad del Arreglo -> retorna el largo del arreglo
        for(int k = 0; k< strArray2.length; k++){
            System.out.println("strArray2[k] = " + k + " = " + strArray2[k]);
        }//A travez de una iteracion imprime cada uno de los elementos que se encuentran dentro del arreglo
    }
}