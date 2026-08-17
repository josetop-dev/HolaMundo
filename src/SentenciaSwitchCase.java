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
    }
}