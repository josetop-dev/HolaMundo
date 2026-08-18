import java.util.Scanner;

public class SentenciaSwitchCaseNumDiasMes {
    public static void main(String args[]) {
        //VARIABLES
        Scanner keyboard = new Scanner(System.in);
        boolean b1 = true;
        int numDias = 0;
        int mes = 0;
        int anio = 0;

        System.out.println("Ingrese el numero del mes...");
        while(b1) {
            try {
                mes = keyboard.nextInt();
                if (mes <= 12 && mes >= 1) {
                    b1 = false;
                } else {
                    System.out.println("Ingrese un mes valido");
                }
            } catch (Exception e) {
                System.out.println("Ingrese un numero...");
                keyboard.nextLine();
            }
        }

        b1=true;
        System.out.println("Ingrese el año YYYY...");
        while(b1) {
            try {
                anio = keyboard.nextInt();
                b1 = false;
            } catch (Exception e) {
                System.out.println("Ingrese un anio valido...");
                keyboard.nextLine();
            }
        }

        //ASIGNACION DE DIAS CON SWITCH-CASE
        switch (mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                numDias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                numDias = 30;
                break;
            case 2:
                if (anio % 400 == 0 || ((anio % 4 == 0) && (anio % 100 == 0))) {
                    numDias=29;
                    System.out.println("Anio Bisiesto");
                }else {
                    numDias=28;
                }
//  Como desde la entrada se asegura que el caso exista no hay necesidad de esto:
//          default:
//              numDias = 0;
        }
        System.out.println("El mes " + mes + " del anio " + anio + " tiene " + numDias + " dias...");
    }
}