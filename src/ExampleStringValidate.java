import java.util.Scanner;
public class ExampleStringValidate {
    public static void main(String[] args) {
        //VARIABLES
        String textConcatenation;
        boolean length;

        //EXAMPLE 1
        System.out.println("\nExample1");
        String text1 = null;
        boolean isNull = text1 == null;//Validacion
        System.out.println("isNull = " + isNull);
        if(isNull){text1 = "hola";}//Add text1 = "hola"
        System.out.println(textConcatenation = text1.concat("\u0020").concat("mundo"));//Concatenacion
        System.out.println(textConcatenation.toUpperCase());//MAYUSCULAS

        //EXAMPLE 2
        System.out.println("\nExample2");
        String text2 = null;//Validacion
        if(text2 == null){text2 = "";}//add text2 = ""
        length = text2.length() == 0;//validacion
        System.out.println("length = " + length);
        if(length){text2 = "hola";}//Add text2 = "hola"
        System.out.println(textConcatenation = text2.concat("\u0020").concat("mundo"));//Concatenacion
        System.out.println(textConcatenation.toUpperCase());//MAYUSCULAS

        //EXAMPLE 3
        System.out.println("\nExample3");
        String text3 = null;
        if(text3 == null){text3 = "";}//Add text3 = ""
        length = text3.isEmpty();//Validacion con .isEmpty() -> return value.length == 0
        System.out.println("length = " + length);
        if(length){text3 = "hola";}//Add text3 = "hola"
        System.out.println(textConcatenation = text3.concat("\u0020").concat("mundo"));//Concatenacion
        System.out.println(textConcatenation.toUpperCase());//MAYUSCULAS

        //EXAMPLE 4
        System.out.println("\nExample4");
        String text4 = null;//Validacion
        if(text4 == null){text4 = "     ";}//Add text4 = "     "
        length = text4.isEmpty();//Validacion con .isEmpty() -> return value.length == 0
        System.out.println("length = " + length);
        if(length){text4 = "hola";}//debido a que (text4.length() == 5) no ejecuta el if
        System.out.println(textConcatenation = text4.concat("\u0020").concat("mundo"));//Concatenacion
        System.out.println(textConcatenation.toUpperCase());//MAYUSCULAS

        //EXAMPLE 5
        System.out.println("\nExample5");
        String text5 = null;//Validacion
        if(text5 == null){text5 = "     ";}//Add text5 = "     "
        if(text5.isBlank()){text5 = "mundo";}//Validacion de si la cadena no es una cadena en blanco --> Add text5 = "mundo"
        System.out.println(textConcatenation = text5.concat("\u0020").concat("mundo"));//Concatenacion
        System.out.println(textConcatenation.toUpperCase());//MAYUSCULAS

        //EXAMPLE 6
        System.out.println("\nExample6");
        String text6 = "  hola mundo ";
        System.out.println("text6.replace('o','0') = " + text6.replace('o','0'));
            /*.replace() remplazo de caracter por otro -> Acepta String "" & char '' */
        System.out.println("text6.indexOf('o') = " + text6.indexOf('o'));
            /*.indexOf() primera ocurrencia retorna la posicion -> Acepta String "" & char '' */
        System.out.println("text6.indexOf('e') = " + text6.indexOf('e'));
            /*.indexOf() un valor que no existe retorna (-1) -> Acepta String "" & char '' */
        System.out.println("text6.lastIndexOf('o') = " + text6.lastIndexOf('o'));
            /*.lastIndexOf() ultima ocurrencia retorna la posicion -> Acepta String "" & char '' */
        System.out.println("text6.lastIndexOf('e') = " + text6.lastIndexOf('e'));
            /*.lastIndexOf() un valor que no existe retorna (-1) -> Acepta String "" & char '' */
        System.out.println("text6.contains(\"mundo\") = " + text6.contains("mundo"));
            /*.contains("Siempre un String nunca un char") busca si existe  -> retorna True || False*/
        System.out.println("text6.contains(\"holi\") = " + text6.contains("holi"));
            /*.contains("Siempre un String nunca un char") busca si existe -> retorna True || False*/
        System.out.println("text6.startsWith(\"h\") = " + text6.startsWith("h"));
            /*.startsWith("Siempre un String nunca un char") compara si empieza con ... -> retorna True || False*/
        System.out.println("text6.endsWith(\"o\") = " + text6.endsWith("o"));
            /*.andsWith("Siempre un String nunca un char") compara si termina con... -> retorna True || False*/
        System.out.println("text6 = " + text6); // Cadena con espacios
        System.out.println("text6.trim() = " + text6.trim());//.trim() elimina espacios al comienzo y al final.
    }
}