public class ExampleStringConcatenacion {
    public static void main(String[] args) {
        //VARIABLES
        String concatenacion;
        String saludo = "Bienvenido";//Instancia de manera automatica (de manera implicita) //de referencia al String PooL
        String name = "José";//Instancia de manera automatica (de manera implicita) //de referencia al String PooL
        int num1 = 30;
        System.out.println("\nnum1 = " + num1);
        int num2 = 70;
        System.out.println("num2 = " + num2);
        char e = '\u0020';//tipo char primitivo sin metodos
        System.out.println("e = " + "espacio tipo char");
        String s = " ";
        System.out.println("s = " + "espacio tipo String");

        //CONCATENACION CON EL OPERADOR '+'
        concatenacion = (saludo +  " " + name);
        System.out.println("\nconcatenacion = (saludo +  \" \" + name) = " + concatenacion);
        System.out.println("\nconcatenacion + e + num1 + num2 = " + concatenacion + e + num1 + num2); //concatena los numeros como si fueran cadenas
        System.out.println("concatenacion + e + (num1 + num2) = " + concatenacion + e + (num1 + num2)); /*al poner los parentesis resuelve primero la
                                                                                           operacion y despues concatena el resultado a la cadena*/
        //CONCATENACION CON METODO DE LA CLASE STRING
        concatenacion = saludo.concat(s.concat(name));
        System.out.println("\nsaludo.concat(s.concat(name)) = " + concatenacion);
        concatenacion = saludo.concat(s).concat(name);
        System.out.println("saludo.concat(s).concat(name) = " + concatenacion);
    }
}
