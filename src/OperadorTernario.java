import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args){
//        /*El operador ternario es una version simplificada del operador if-else*/
//        String resultado1 = 7==7? "aprobado" : "reprobado";
//        System.out.println("resultado1 = " + resultado1);
//
//        /*El operador if-else ocupa mas lineas de codigo*/
//        String resultado2;
//        if(7==7){
//            resultado2 = "aprobado";
//        }else{
//            resultado2 = "reprobado";
//        }
//        System.out.println("resultado2 = " + resultado2);

        //CODIGO DINAMICO DE PROMEDIO APROBATORIO O REPROBATORIO
        Scanner keyboard = new Scanner(System.in);
        double matematicas;
        double quimica;
        double programacion;
        double promedio;
        String resultado;

        System.out.println("Calculadora de promedio\n");
        System.out.println("Ingrese la calificacion de matematicas en escala del 1 al 10");
        matematicas = keyboard.nextDouble();
        System.out.println("Ingrese la calificacion de quimica en escala del 1 al 10");
        quimica = keyboard.nextDouble();
        System.out.println("Ingrese la calificacion de programacion en escala del 1 al 10");
        programacion = keyboard.nextDouble();

        promedio = (matematicas+quimica+programacion)/3;
        resultado = promedio>=7?"APROBADO":"REPROBADO"; //OPERADOR TERNARIO asigna valor a variable resultado de tipo String
        System.out.println("\n" + resultado);
        System.out.println("promedio = " + promedio);
    }
}