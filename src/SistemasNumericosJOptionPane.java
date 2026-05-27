import javax.swing.*;

public class SistemasNumericosJOptionPane {
    public static void main(String[] args) {
        //CODE
        String numeroStr = JOptionPane.showInputDialog(null,"Ingrese un numero");
        int numero = 0;

        //Manejo de errores
        try {
            numero = Integer.parseInt(numeroStr);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Error deve ingrasar un numero entero");
            main(args);
            System.exit(0);
        }

        //Variables resultados
        String resultadoDecimal = "Numero Decimal = " + numero;
        String resultadoBinario = "Numero Binario de " + numero + " = " + Integer.toBinaryString(numero);
        String resultadoOctal = "Numero Octal de " + numero + " = " + Integer.toOctalString(numero);
        String resultadoHexaDecimal = "Numero HexaDecimal de " + numero + " = " + Integer.toHexString(numero);

        //Imprecion en consola
        System.out.println(resultadoDecimal);
        System.out.println(resultadoBinario);
        System.out.println(resultadoOctal);
        System.out.println(resultadoHexaDecimal);

        //Imprecion en ventana
        String valores = resultadoDecimal;
        valores += "\n" + resultadoBinario;
        valores += "\n" + resultadoOctal;
        valores += "\n" + resultadoHexaDecimal;
        JOptionPane.showMessageDialog(null,valores);

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