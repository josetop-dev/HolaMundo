public class ExampleStringInmutable {
    public static void main(String[] args) {
        //VARIABLES
        char e = '\u0020';//tipo char primitivo sin metodos
        String s = " ";
        String saludo = "Bienvenido";//Instancia de manera automatica (de manera implicita) //de referencia al String PooL
        String name = "José";//Instancia de manera automatica (de manera implicita) //de referencia al String PooL

        //CODE
        saludo.concat(s.concat(name));//.concat() genera una nueva instancia no altera a saludo, no lo modifica
        System.out.println("\nsaludo: " + saludo);//imprime la variable saludo original

        String concatenacion1 = saludo.concat(s.concat(name));//.concat() genera una nueva instancia no altera a saludo, no lo modifica
        String concatenacion2 = saludo.concat(s.concat(name));//.concat() genera una nueva instancia no altera a saludo, no lo modifica

        System.out.println("concatenacion2: " + concatenacion2);
        System.out.println("concatenacion1 == concatenacion2: " + (concatenacion1 == concatenacion2));/*.concat() genera una nueva instancia cada vez que se usa
                                                                                                        sin importar si es exactamente igual a la anterior por lo
                                                                                                        tanto sus referencias apuntan hacia instancias distintas*/
        System.out.println("saludo == concatenacion2: " + (saludo == concatenacion2));/*.concat() genera una nueva instancia cada vez que se usa, por lo que al
                                                                                          comparar las referencias de ambas cadenas sera false ya que apuntan a
                                                                                          instancias completamente distintas*/
        saludo.transform(a -> {return a + s + name;});//.transform( {}) genera una nueva instancia no altera a saludo, no lo modifica
        System.out.println("\nsaludo: " + saludo);//imprime la variable saludo original

        String concatenacion3 = saludo.transform(a -> {return a + s + name;});//.transform( {}) genera una nueva instancia no altera a saludo, no lo modifica
        String concatenacion4 = saludo.transform(a -> {return a + s + name;});//.transform( {}) genera una nueva instancia no altera a saludo, no lo modifica

        System.out.println("concatenacion4: " + concatenacion4);
        System.out.println("concatenacion3 == concatenacion4: " + (concatenacion3 == concatenacion4));/*.transform( {}) genera una nueva instancia cada vez que se usa
                                                                                                         sin importar si es exactamente igual a la anterior por lo
                                                                                                         tanto sus referencias apuntan hacia instancias distintas*/
        System.out.println("saludo == concatenacion4: " + (saludo==concatenacion4));/*.transform( {}) genera una nueva instancia cada vez que se usa, por lo que al
                                                                                          comparar las referencias de ambas cadenas sera false ya que apuntan a
                                                                                          instancias completamente distintas*/

        saludo.replace("o","@");//.replace() genera una nueva instancia no altera a saludo, no lo modifica
        System.out.println("\nsaludo: " + saludo);//imprime la variable saludo original

        String replace1 = saludo.replace("o","@");//.replace() genera una nueva instancia no altera a saludo, no lo modifica
        String replace2 = saludo.replace("o","@");//.replace() genera una nueva instancia no altera a saludo, no lo modifica

        System.out.println("replace2: " + replace2);
        System.out.println("replace1 == replace2: " + (replace1 == replace2));/*.replace() genera una nueva instancia cada vez que se usa
                                                                                 sin importar si es exactamente igual a la anterior por lo
                                                                                 tanto sus referencias apuntan hacia instancias distintas*/
        System.out.println("saludo == replace2: " + (saludo == replace2));/*.replace() genera una nueva instancia cada vez que se usa, por lo que al
                                                                             comparar las referencias de ambas cadenas sera false ya que apuntan a
                                                                             instancias completamente distintas*/
    }
}
