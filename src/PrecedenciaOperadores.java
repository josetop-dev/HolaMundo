public class PrecedenciaOperadores {
    public static void main(String[] args) {
        //VARIABLES
        int i = 16;
        int j = 9;
        int k = 19;

        double resultado = i + j + k / 3d; // 16 + 9 + (19 / 3)
        System.out.println("resultado = " + resultado); //resultado = 31.333333333333332

        resultado = (i + j + k) / 3d; // (16 + 9 + 19) / 3
        System.out.println("resultado = " + resultado); //resultado = 14.666666666666666

        resultado = i + j + k / 3d * 18; // [16 + 9 + ((19 / 3) * 18)]
        System.out.println("resultado = " + resultado); //resultado = 139.0

        resultado = ++i + --j + k++ / 3d * 18; // [17 + 8 + ((19 / 3) * 18)]
        System.out.println("resultado = " + resultado); //resultado = 139.0

        System.out.println("i = " + i); //17
        System.out.println("j = " + j); //8
        System.out.println("k = " + k); //20
    }
}