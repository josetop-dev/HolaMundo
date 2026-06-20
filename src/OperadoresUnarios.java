public class OperadoresUnarios {
    public static void main (String[] args){
        /*Se utilizan los operadores unarios para invertir el signo del numero*/
        int i = 5; // Numero original positivo
        System.out.println("i = " + i);
        int j = +i; //(+1)(+5)=+5 -->operacion que se esta ejecutando --> operador unario mas
        System.out.println("j = " + j);
        int k = -i; //(-1)(+5)=-5 -->operacion que se esta ejecutando --> operador unario menos
        System.out.println("k = " + k);

        i = -10; //Numero original negativo
        System.out.println("i = " + i);
        j = +i; //(+1)(-10)=-10 -->operacion que se esta ejecutando --> operador unario mas
        System.out.println("j = " + j);
        k = -i; //(-1)(-10)=+10 -->operacion que se esta ejecutando --> operador unario menos
        System.out.println("k = " + k);
    }
}
