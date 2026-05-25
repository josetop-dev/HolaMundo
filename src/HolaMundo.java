import java.util.Scanner;
    public static void main(String[] args) {
        //VARIABLES
        String nombre;
        boolean condicion = true;
        Scanner teclado;

        //PROGRAMA
        teclado = new Scanner(System.in);
        if(condicion) {
            System.out.println("Cual es tu nombre?");
            nombre = teclado.nextLine();
            System.out.println("Hola " + nombre + " bienvenido seas al camino a Microsoft!");
            System.out.println("Dia 1 -> Meta: Ser de los mejores");
        }
    }

