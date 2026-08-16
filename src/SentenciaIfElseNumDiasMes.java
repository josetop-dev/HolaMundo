import javax.crypto.KEM;
import java.util.Scanner;

public class SentenciaIfElseNumDiasMes {
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

        //ASIGNACION DE DIAS
        if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12){
            numDias=31;
        } else if (mes==4||mes==6||mes==9||mes==11) {
            numDias=30;
        } else if (anio % 400 == 0 || ((anio % 4 == 0) && (anio % 100 == 0))) {
            numDias=29;
            System.out.println("Anio Bisiesto");
        }else {
            numDias=28;
        }
        System.out.println("El mes " + mes + " del anio " + anio + " tiene " + numDias + " dias...");
    }
}