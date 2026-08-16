import java.util.Scanner;

public class SentenciaIfElse {
    public static void main(String args[]) {
        //VARIABLES
        Scanner keyboard = new Scanner(System.in);
        double promedio = 9;
        boolean b1 = true;

        System.out.println("Ingrese su promedio");
        while(b1) {
            String str = keyboard.nextLine().trim();
            try {
                promedio = Double.parseDouble(str);
                if(promedio<=10 && promedio>=0){
                    b1 = false;
                }else {
                    System.out.println("Ingrese un promedio del 0 al 10");
                    continue;
                }
            } catch (Exception e) {
                System.out.println("Ingrese un numero valido");
            }
        }

        //IF-ElSE
        if (promedio >= 9) {
            System.out.println("Exelente");
        } else if (promedio >= 8) {
            System.out.println("Bien");
        } else if (promedio >= 7){
            System.out.println("Regular");
        } else if (promedio >= 6){
            System.out.println("Deficiente");
        } else {
            System.out.println("Reprobado");
        }
    }
}