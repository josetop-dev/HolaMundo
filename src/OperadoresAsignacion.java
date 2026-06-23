public class OperadoresAsignacion {
    public static void main(String[] args){
        int i = 5;/*el operador de asignacion es = asigna el valor a una variable*/
        System.out.println("i = " + i);
        int j = i + 4;
        System.out.println("j = i + 4 --> " + j);
        i += 2;// i = i + 2; <-- suma escrita de una manera mas simplificada
        System.out.println("i += 2 --> " + i);
        i += 5;// i = i + 5; <-- suma escrita de una manera mas simplificada
        System.out.println("i += 5 --> " + i);
        j -= 4;// j = j - 4; <-- resta escrita de una manera mas simplificada
        System.out.println("j -= 4 --> " + j);
        i *= 2;// i = i * 2; <-- multiplicasion escrita de una manera mas simplificada
        System.out.println("i *= 2 --> " + i);
        i /= 4;// i = i / 4; <-- divicion escrita de una manera mas simplificada
        System.out.println("i /= 4 --> " + i);
        i %= j;// i = i % j; <-- mod escrita de una manera mas simplificada
        System.out.println("i %= j --> " + i);
        String cadena = "Hola";
        cadena += " "; //Concatenacion de manera mas simplificada
        cadena += "Mundo"; //Concatenacion de manera mas simplificada
        System.out.println("cadena = " + cadena);
    }
}