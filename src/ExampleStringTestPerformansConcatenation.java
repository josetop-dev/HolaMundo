public class ExampleStringTestPerformansConcatenation {
    public static void main(String[] args) {
        //VARIABLES
        String str1 = "a";
        String str2 = "b";
        String str3 = "c";

        StringBuilder str4 = new StringBuilder(str1);//Nota: StringBuilder es mutable a diferencia del String que no lo es.

        long inicio = System.currentTimeMillis();
        for(int i = 0; i<100; i++){
            //str1 += str2 + str3 + "\n"; //____________________________________100->6ms; 1000->10ms; 10000->81ms;  100000->2448ms;
            //str1 = str1.concat(str2).concat(str3).concat("\n"); //____________100->0ms; 1000->3ms;  10000->100ms; 100000->6942ms;
              str4.append(str1).append(str2).append(str3).append("\n"); //______100->0ms; 1000->1ms;  10000->3ms;   100000->17ms;
        }
        long fin = System.currentTimeMillis();

        System.out.println(fin - inicio);
        //System.out.println("str1 = " + str1);
        //System.out.println("str4 = " + str4.toString());
    }
}
