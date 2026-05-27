import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosScanner {
    public static void main(String[] args) {
        //CODE
        Scanner keyboard =  new Scanner(System.in);
        System.out.println("Ingrese un numero");
        //String numeroStr = keyboard.nextLine(); --> cadena como entrada (Teclado)
        int numero = 0;

        //Manejo de errores
        try {
            //numero = Integer.parseInt(numeroStr); --> convercion de String --> Integer
            numero = keyboard.nextInt();  //--> Integer como entrada (Teclado)
        }catch (InputMismatchException e){
            System.out.println("Error deve ingrasar un numero entero");
            main(args); //loop
            System.exit(0);//finish
        }

        //Variables resultados
        String resultadoDecimal = "Numero Decimal = " + numero;
        String resultadoBinario = "Numero Binario de " + numero + " = " + Integer.toBinaryString(numero);
        String resultadoOctal = "Numero Octal de " + numero + " = " + Integer.toOctalString(numero);
        String resultadoHexaDecimal = "Numero HexaDecimal de " + numero + " = " + Integer.toHexString(numero);

        //Imprecion en consola
        String valores = resultadoDecimal;
        valores += "\n" + resultadoBinario;
        valores += "\n" + resultadoOctal;
        valores += "\n" + resultadoHexaDecimal;

        System.out.println(valores);

                    /* ESCRITURA PARA IMPRIMIR VALORES EN DECIMAL AUN ESCRITOS EN DIFERENTES SISTEMAS NUMERICOS
                    int numeroDecimal = 123;
                    int numeroBinario = 0B1111011;
                    int numeroOctal = 0173;
                    int numeroHexaDecimal = 0x7b;
                    if(numeroDecimal==numeroBinario && numeroDecimal==numeroOctal && numeroDecimal==numeroHexaDecimal){
                        System.out.println();
                        System.out.println("numeroDecimal = " + numeroDecimal);
                        System.out.println("numeroBinario a decimal = " + numeroBinario);
                        System.out.println("numeroOctal a decimal = " + numeroOctal);
                        System.out.println("numeroHexaDecimal a decimal = " + numeroHexaDecimal);
                    }else{
                        System.out.println("FALSE");
                    }*/
    }
}