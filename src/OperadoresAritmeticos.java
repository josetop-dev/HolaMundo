import javax.swing.JOptionPane;

public class OperadoresAritmeticos {
    public static void main(String[]  args){
        int i=7, j=5, suma=i+j;/*se pueden inicializar las variables de esta manera siempre que sean del mismo tipo y
        separados por una coma*/
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("suma = " + suma);

        System.out.println("i+j = " + i+j);/*como lo primero que encuentra es un String concatena los numeros como si
        fueran un String y no los suma*/
        System.out.println(i+j + " = i+j");/*cuando lo primero que encuentra son numeros realiza la operacion de manera
        correcta posteriormente intenta sumar la cadena pero al no poder entonces opta por concatenarla*/
        System.out.println("(i+j) = " + (i+j));/*uso de parentesis para que realice la operacion aritmetica correctamente
        antes de concatenar a lo que es la cadena (los parentesis tienen la prioridad maxima)*/

        int resta = i-j;
        System.out.println("resta = " + resta);
        System.out.println("(i-j) = " + (i-j));/*entre parentesis la resta para que se realice primero la operacion antes 
        de concatenar y no marque error*/

        int multi = i*j;
        System.out.println("multi = " + multi);
        System.out.println("i*j = " + i*j);/*la multiplicacion tiene preferencia antes que el operador de suma por lo
        que no hay problema en este caso pero es preferible usar parentesis para ser mas especificos*/

        int div = i/j;
        System.out.println("div = " + div);/*el resultado deveria de ser 1.4 pero devido a que se guarda el resultado
        en una variable de tipo int no es correcto el resultado*/
        System.out.println("i/j = " + i/j);/*la divicion tiene preferencia antes que el operador de suma por lo que no
        hay problema en este caso pero es preferible usar parentesis para ser mas especificos sin embargo el resultado es erroneo*/
        float div2 = i/j;
        System.out.println("div2 = " + div2);/*a pesar de que se a guardado en una variable de tipo float el resultado
        sigue siendo erroneo porque los numeros i & j no manejan decimales por lo que hay perdida de informacion antes
        de que se guarde el resultado final en la variable de tipo float*/
        float div3 = (float)i/j;/*casting para convertir las variables de tipo int en float y no haya perdida de
        informacion al momento de dividir*/
        System.out.println("div3 = " + div3);//resultado correcto = 1.4
        System.out.println("(float)i/j = " + (float)i/j);/*casting para que el resultado sea correcto*/ 
                

        int residuo = i%j;
        System.out.println("residuo = " + residuo);
        System.out.println("i%j = " + i%j);/*el operador mod tiene preferencia antes que el operador de sama pero es
        preferible usar parentesis para ser mas especificos*/
        boolean valor = false;
        while(valor == false) {
            try {
                int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero:"));/*ingreso de datos por medio de una ventana */
               valor = true;
                if (numero % 2 == 0) {
                    System.out.println("EL NUMERO " + numero + " ES PAR");
                } else {
                    System.out.println("EL NUMERO " + numero + " ES IMPAR");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ingresa un numero...");
            }
        }
    }
}