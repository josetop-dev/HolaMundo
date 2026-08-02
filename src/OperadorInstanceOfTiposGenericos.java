 public class OperadorInstanceOfTiposGenericos {
    public static void main(String[] args){
        //instanceof valida si el objeto es del tipo de una clase
        //VARIABLES Objetos (tipos de referencia)
        Object texto = "Jose"; //texto es del tipo String --> asociado al tipo Object Generico
        Object texto2 = String.valueOf("Sara"); //Creado de forma explicita con el metodo estatico de la clase String
        //TODOS LOS NUMEROS EN JAVA SON DEL TIPO NUMBER GENERICO
        Number numero = 365; //numero es del tipo Integer --> asociado al tipo Number Generico
        Number numero2 = Integer.valueOf(24); //Creado de forma explicita con el metodo estatico de la clase Integer
        Number decimal = 7.7f; //decimal es del tipo Float --> asociado al tipo Number Generico
        Number decimal2 = Float.valueOf(7.7f);  //Creado de forma explicita con el metodo estatico de la clase Float
        Object b1 = false; //b1 es del tipo Boolean --> asociado al tipo Object Generico
        Object b2 = Boolean.valueOf(true); //Creado de forma explicita con el metodo estatico de la clase Boolean

//OBJECT es la clase padre de todos los objetos y de todas las clases en JAVA
        b1 = texto instanceof Double;
        System.out.println("texto es del tipo Double = " + b1);
        b1 = texto instanceof Integer;
        System.out.println("texto es del tipo Integer = " + b1);

            b1 = numero instanceof Double;
            System.out.println("\nnumero es del tipo Double = " + b1);
            b1 = numero instanceof Float;
            System.out.println("numero es del tipo Float = " + b1);
            b1 = numero instanceof Short;
            System.out.println("numero es del tipo Short = " + b1);

                b1 = decimal instanceof Integer;
                System.out.println("\ndecimal es del tipo Integer = " + b1);
                b1 = decimal instanceof Double;
                System.out.println("decimal es del tipo Double = " + b1);
                b1 = decimal instanceof Long;
                System.out.println("decimal es del tipo Long = " + b1);

                    b1 = b2 instanceof String;
                    System.out.println("\nb2 es del tipo String = " + b1);
                    b1 = b2 instanceof Integer;
                    System.out.println("b2 es del tipo Integer = " + b1);
    }
}