public class OperadorInstanceOf {
    public static void main(String[] args){
        //instanceof valida si el objeto es del tipo de una clase
        //VARIABLES Objetos (tipos de referencia)
        String texto = "Jose"; //De forma literal se puede crear un String
        String texto2 = new String("Sara"); //De forma explicita (deprecated)
        Integer numero = 365; //De forma literal se puede crear un Integer
        Integer numero2 = new Integer(24); //De forma explicita (deprecated)
        Double decimal = 7.7; //De forma literal se puede crear un Double
        Double decimal2 = new Double(7.7);  //De forma explicita (deprecated)
        Boolean b1 = false; //De forma literal se puede crear im Boolean
        Boolean b2 = new Boolean(false); //De forma explicita (deprecated)

//OBJECT es la clase padre de todos los objetos y de todas las clases en JAVA
        b1 = texto instanceof String;
        System.out.println("texto es del tipo String = " + b1);
        b1 = texto instanceof Object;
        System.out.println("texto es del tipo Object = " + b1);

            b1 = numero instanceof Integer;
            System.out.println("\nnumero es del tipo Integer = " + b1);
            b1 = numero instanceof Number;
            System.out.println("numero es del tipo Number = " + b1);
            b1 = numero instanceof Object;
            System.out.println("numero es del tipo Object = " + b1);

                b1 = decimal instanceof Double;
                System.out.println("\ndecimal es del tipo Double = " + b1);
                b1 = decimal instanceof Number;
                System.out.println("decimal es del tipo Number = " + b1);
                b1 = decimal instanceof Object;
                System.out.println("decimal es del tipo Object = " + b1);

                    b1 = b2 instanceof Boolean;
                    System.out.println("\nb2 es del tipo Boolean = " + b1);
                    b1 = b2 instanceof Object;
                    System.out.println("b2 es del tipo Object = " + b1);
    }
}