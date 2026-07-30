import java.util.Scanner;

public class OperadorTernarioNumeroMayor {
    public static void main(String[] args){
        //VARIABLES
        int num1, num2, num3, num4, max;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        num1 = keyboard.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = keyboard.nextInt();
        System.out.println("Ingrese el tercer numero");
        num3 = keyboard.nextInt();
        System.out.println("Ingrese el cuarto numero");
        num4 = keyboard.nextInt();

        max = (num1 > num2)? num1: num2; //operador ternario
        max = (max  > num3)?  max: num3; //operador ternario
        max = (max  > num4)?  max: num4; //operador ternario

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("El numero mas grande es: " + max);
    }
}