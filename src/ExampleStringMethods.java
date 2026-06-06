public class ExampleStringMethods {
    public static void main(String[] args) {
        String nombre = "Jose";
        System.out.println("nombre.length() = " + nombre.length()); //Regresa el largo de la cadena
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());//Retorna la cadena en Mayuculas
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());//Retorna la cadena en Minusculas
        System.out.println("nombre.equals(\"JOSE\") = " + nombre.equals("JOSE"));
        /*Compara la cadena a nivel de valor y no de instancia -> TRUE || FALSE*/
        System.out.println("nombre.equals(\"Jose\") = " + nombre.equals("Jose"));
        /*Compara la cadena a nivel de valor y no de instancia -> TRUE || FALSE*/
        System.out.println("nombre.equalsIgnoreCase(j) = " + nombre.equalsIgnoreCase("JoSe"));
        /*Compara la cadena a nivel de valor y no de instancia -> TRUE || FALSE -> Ignora Mayusculas && Minusculas*/
        System.out.println("nombre.compareTo(\"jOsE\") = " + nombre.compareTo("Jose"));
        /*comparacion con .compareTo si retorna 0 es igual la cadena, si no -> es distinta*/
        System.out.println("nombre.compareTo(\"JOSE\") = " + nombre.compareTo("JOSE"));
        /*comparacion con .compareTo si retorna 0 es igual la cadena, si no -> es distinta*/
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));//.charAt retorna un caracter
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));//.charAt retorna un caracter
        System.out.println("nombre.charAt(2) = " + nombre.charAt(2));//.charAt retorna un caracter
        System.out.println("nombre.charAt(3) = " + nombre.charAt(3));//.charAt retorna un caracter
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));
        /*.charAt retorna un caracter -> Ultimo caracter de forma dinamica*/
        System.out.println("nombre.substring(2) = " + nombre.substring(2));
        /*.substring obtiene parte de un String (desde -> final)*/
        System.out.println("nombre.substring(1,3) = " + nombre.substring(1,3));
        /*.substring obtiene parte de un String (desde -> hasta)*/
        System.out.println("nombre.substring(nombre.length()-1) = " + nombre.substring(nombre.length()-1));
        /*.substring obtiene parte de un String (ultimo caracter de forma dinamica)*/

        String text = "  hola mundo ";
        System.out.println("\ntext = " + text);
        System.out.println("text.replace('o','0') = " + text.replace('o','0'));
        /*.replace() remplazo de caracter por otro -> Acepta String "" & char '' */
        System.out.println("text.indexOf('o') = " + text.indexOf('o'));
        /*.indexOf() primera ocurrencia retorna la posicion -> Acepta String "" & char '' */
        System.out.println("text.indexOf('e') = " + text.indexOf('e'));
        /*.indexOf() un valor que no existe retorna (-1) -> Acepta String "" & char '' */
        System.out.println("text.lastIndexOf('o') = " + text.lastIndexOf('o'));
        /*.lastIndexOf() ultima ocurrencia retorna la posicion -> Acepta String "" & char '' */
        System.out.println("text.lastIndexOf('e') = " + text.lastIndexOf('e'));
        /*.lastIndexOf() un valor que no existe retorna (-1) -> Acepta String "" & char '' */
        System.out.println("text.contains(\"mundo\") = " + text.contains("mundo"));
        /*.contains("Siempre un String nunca un char") busca si existe  -> retorna True || False*/
        System.out.println("text.contains(\"holi\") = " + text.contains("holi"));
        /*.contains("Siempre un String nunca un char") busca si existe -> retorna True || False*/
        System.out.println("text.startsWith(\"h\") = " + text.startsWith("h"));
        /*.startsWith("Siempre un String nunca un char") compara si empieza con ... -> retorna True || False*/
        System.out.println("text.endsWith(\"o\") = " + text.endsWith("o"));
        /*.andsWith("Siempre un String nunca un char") compara si termina con... -> retorna True || False*/
        System.out.println("text = " + text); // Cadena con espacios
        System.out.println("text.trim() = " + text.trim());//.trim() elimina espacios al comienzo y al final.
    }
}
