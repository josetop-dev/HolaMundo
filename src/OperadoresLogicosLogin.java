import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args){
//                /*
//                        //BASE PARA CUALQUIER SISTEMA LOGIN FORMA 1
//                        //VARIABLES DE FORMA MANUAL
//                        String username1 = "Jose";
//                        String password1 = "1234";
//                        String username2 = "Sara";
//                        String password2 = "4321" ;
//
//                        boolean autenticacion = false;
//                        Scanner keyboard = new Scanner(System.in); //creacion del Scanner
//
//                        //INGRESO DE CREDENCIALES
//                        System.out.println("Ingrese el usuario");
//                        String usuario = keyboard.nextLine(); //cadena usuario ingrasada por el usuario a travez del teclado
//                        System.out.println("Ingrese la clave");
//                        String clave = keyboard.nextLine(); //cadena clave ingresada por el usuario a travez del teclado
//
//                        //CICLOS --> ACTUALIZACION DE FORMA MANUAL
//                        if((username1.equals(usuario) && password1.equals(clave)) ||
//                           (username2.equals(usuario) && password2.equals(clave))){
//                            autenticacion = true;//cambio de valor a la variable autenticacion
//                        }else{
//                            System.out.println("Usuario o contraseña no validos");
//                        }
//
//                        if(autenticacion){
//                            System.out.println("Welcome ".concat(usuario).concat("!")); //concatenacion dinamica para dar bienvenida personalizada
//                        }else{
//                            System.out.println("Requiere de autenticacion");
//                        }
//                */

        //BASE PARA CUALQUIER SISTEMA LOGIN FORMA 2
        //ARREGLOS
        Scanner keyboard = new Scanner(System.in); //creacion del Scanner
        boolean autenticacion = false;

//        MANERA NUMERO 1 DE ESCRIBIR UN ARREGLO EN JAVA
//      String[] usernames = new String[3]; //se inicializa con tres elementos
//      String[] passwords = new String[3]; //se inicializa con tres elementos

//      usernames[0] = "Jose"; //se agrega con los indices un String al arreglo
//      passwords[0] = "1234"; //se agrega con los indices un String al arreglo
//      usernames[1] = "Sara"; //se agrega con los indices un String al arreglo
//      passwords[1] = "4321"; //se agrega con los indices un String al arreglo
//      usernames[2] = "Nubia"; //se agrega con los indices un String al arreglo
//      passwords[2] = "4321"; //se agrega con los indices un String al arreglo

//        MANERA NUMERO 2 DE ESCRIBIR UN ARREGLO EN JAVA
        String[] usernames = {"Jose", "Sara", "Nubia"}; //se inicializa con tres elementos definidos de forma explicita
        String[] passwords = {"1234", "4321", "4321"}; //se inicializa con tres elementos definidos de forma explicita

        //INGRESO DE CREDENCIALES
        System.out.println("Ingrese el usuario");
        String usuario = keyboard.nextLine(); //cadena usuario ingrasada por el usuario a travez del teclado
        System.out.println("Ingrese la clave");
        String clave = keyboard.nextLine(); //cadena clave ingresada por el usuario a travez del teclado
        for(int i=0; i< usernames.length; i++){
//             if(usernames[i].equals(usuario) && passwords[i].equals(clave)){
//                autenticacion = true; //cambia el valor de la variable autenticacion
//                break; //Sale del ciclo for
//            }
            /*se ocupara el operador ternario pues la lista es muy pequeña pero en caso de ser mas de 100 entonces se
            optaria por el if-else para el uso del brake y no gastar recursos de mas*/
            autenticacion = usernames[i].equals(usuario) && passwords[i].equals(clave)? true : autenticacion;
            /*El operador ternario como no tiene el brake continuara con la iteracion del ciclo for*/
        }
        /*if (autenticacion) {
            System.out.println("Welcome ".concat(usuario).concat("!"));
        }else {
            System.out.println("Usuario o contraseña incorrectos");
            System.out.println("Requiere de autenticacion");
        }*/
        //se asigna el mensaje usando un operador ternario dependiendo del caso
        String mensaje = autenticacion? "Welcome ".concat(usuario).concat("!")
                :"Usuario o contraseña incorrectos \nRequiere de autenticacion";
        System.out.println(mensaje);
    }
}