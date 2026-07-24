public class OperadoresRelacionales {
    public static void main(String[] args){
        //VARIABLES
        int i = 1;
        byte j = 7;
        float k = 1.1e-2f;//0.011
        double l = 4.4e2;//440.0
        boolean m = false;

        boolean b1 = (i == j);//operador de igualdad --> FALSE
        System.out.println("b1 = " + b1);//--> false
        boolean b2 = (!b1);//operador de negacion --> TRUE
        System.out.println("b2 = " + b2);// --> true
        boolean b3 = (i != j);//operador de desigualdad --> TRUE
        System.out.println("b3 = " + b3);// --> true
        boolean b4 = (m == true);//operador de igualdad --> FALSE
        System.out.println("b4 = " + b4);// --> false
        boolean b5 = (m != true);//operador de desigualdad --> TRUE
        System.out.println("b5 = " + b5);// --> true
        boolean b6 = (i > j);//operador mayor que --> FALSE
        System.out.println("b6 = " + b6);// --> false
        boolean b7 = (i < j);//operador menor que --> TRUE
        System.out.println("b7 = " + b7);// --> true
        boolean b8 = (k >= l);//operador mayor igual que --> FALSE
        System.out.println("b8 = " + b8);// --> false
        boolean b9 = (k <= l);//operador menor igual que --> TRUE
        System.out.println("b9 = " + b9);// --> true
    }
}