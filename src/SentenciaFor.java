public class SentenciaFor {
    public static void main(String[] args) {
        for(int i = 0; i<=5;i++){
            System.out.println("i = " + i);
        }

        for(int j = 5; j>=0; j--){
            System.out.println("j = " + j);
        }

        for(int k = 0, l = 10; k < l; k++,l--){
            System.out.println(k + " < " + l);
        }

        for(int m = 0; m<5; ){
            System.out.println("m = " + m);
            m++; //Se puede incrementar aca
        }

        int n = 0; //se puede inicializar aca
        for(;n<5;) {
            n++; //se puede incrementar aca
            System.out.println("n = " + n);
        }

        int p = 0; //iniciado fuera
        for( ; ; ){
            if(p>5){
                break; //condicion dentro
            }
            System.out.println("p = " + p);
            p++; //incremento dentro
        }

        //Impresion de numeros pares
        for(int i = 0; i < 20; i++){
            if(i % 2 != 0){
                continue; //sale de la iteracion y continua con la siguiente iteracion
            }
            System.out.println("par = " + i);
        }
        //Impresion de numeros impares
        for(int i = 0; i < 20; i++){
            if(i % 2 == 0){
                continue; //sale de la iteracion y continua con la siguiente iteracion
            }
            System.out.println("impar = " + i);
        }
    }
}