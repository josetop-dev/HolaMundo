public class OperadoresLogicos {
    public static void main(String[] args){
        //VARIABLES
        int i = 1;
        byte j = 7;
        float k = 1.1e-2f;//0.011
        double l = 4.4e2;//440.0
        boolean m = false;

        boolean b1 = (i == j) && (k > l);//operador logico AND
        System.out.println("b1 = " + b1);//--> false
        boolean b2 = i==j && k>l || m==false;//se evalua de izquierda a derecha primero AND luego OR
        System.out.println("b2 = " + b2);//--> true
        boolean b3 = i==j && (k>l || m==false);//con parentesis se cambia la precedencia primero OR luego AND
        System.out.println("b3 = " + b3);//--> false
        boolean b4 = i==j && k>l && m==false;/*se evalua de izquierda a derecha primero AND luego otro AND pero como la
        primera exprecion relacional es false toda la exprecion es falsa ya no evalua mas alla*/
        System.out.println("b4 = " + b4);//--> false

        //PRECEDENCIA EN LOS OPERADORES LOGICOS
        /*siempre va a tener mayor prioridad el operador AND antes que el OR*/
        boolean b5 = i<j || k>l && m==true;/* true || false && false */
        System.out.println("b5 = " + b5);//--> true
        /*si se requiere evaluar la exprecion dada por el operador OR entonces se ocupan parentesis para darle
        prioridad antes que el operador AND*/
        boolean b6 = (i<j || k>l) && m==true;/* (true || false) && false*/
        System.out.println("b6 = " + b6);//--> false
        boolean b7 = true || false && false || false;/*se evalua de esta manera por prioridad de los operadores logicos
        --> (true || (false && false)) || false*/
        System.out.println("b7 = " + b7);//--> true
        boolean b8 = ((true || false) && false) || false;/*Uso de parentesis para cambiar la prioridad de los operadores por defecto*/
        System.out.println("b8 = " + b8);//--> false
    }
}