import java.util.Scanner;

public class SentenciaSwitchCase {
    public static void main(String[] args){
        int num = 1;
        switch (num){
            case 0:
                System.out.println("Hola Jose");
                break; //Con break se sale del switch
            case 1:
                System.out.println("Hola Nubia");
                break;
            case 2:
                System.out.println("Hola Izura");
                break;
            default:
                System.out.println("Numero desconocido");
        }
        String str = "Nubia";
        switch(str){
            case "Jose":
                System.out.println("Admin");
                break;
            case "Nubia":
                System.out.println("Developer");
                break;
            case "Izura":
                System.out.println("Actriz");
                break;
            default:
                System.out.println("Nombre desconocido");
        }
        char ch = 'H';
        switch (ch){
            case '1':
                System.out.println("Encendido");
                break;
            case '0':
                System.out.println("Apagado");
                break;
            case 'H':
                System.out.println("Encendido");
                break;
            case 'L':
                System.out.println("Apagado");
                break;
            default:
                System.out.println("Caracter desconocido");
        }

        //MOSTRAR MES
        Scanner keyboard = new Scanner(System.in);
        String mes = null;
        boolean b1 = true;
        int numMes = 0;
        System.out.println("Ingrese el numero del mes...");
        while (b1) {
            try {
                numMes = keyboard.nextInt();
                if(numMes<=12 && numMes>=1){
                    b1 = false;
                }else {
                    System.out.println("Ingrese un numero entre 1 & 12...");
                }
            } catch (Exception e) {
                System.out.println("Ingresa un numero entre 1 & 12...");
                keyboard.nextLine();
            }
        }
        switch (numMes){
            case 1:
                mes = "Enero";
                break;
            case 2:
                mes = "Febrero";
                break;
            case 3:
                mes = "Marzo";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Mayo";
                break;
            case 6:
                mes = "Junio";
                break;
            case 7:
                mes = "Julio";
                break;
            case 8:
                mes = "Agosto";
                break;
            case 9:
                mes = "Septiembre";
                break;
            case 10:
                mes = "Octubre";
                break;
            case 11:
                mes = "Noviembre";
                break;
            case 12:
                mes = "Diciembre";
                break;
//  Como desde la entrada se asegura que el caso exista no hay necesidad de esto:
//          default:
//                mes = "Indefnido";
        }
        System.out.println("mes = " + mes);
    }
}