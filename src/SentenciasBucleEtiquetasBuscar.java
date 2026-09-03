import javax.swing.*;

public class SentenciasBucleEtiquetasBuscar {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog(null, "Pega el texto");
        String buscar = JOptionPane.showInputDialog(null,"Escribe el caracter o palabra a buscar en el texto anterior");
        int sizepalabra = buscar.length();
        int sizetexto = texto.length();
        int contador = 0;
        String sms = buscar.length()==1? "Se encontro el caracter ": "Se encontro la palabra ";

        if(buscar.length()==1) {
            for (int i = 0; i < sizetexto; i++) {
                if (texto.charAt(i) != buscar.charAt(0)) {
                    continue;
                }
                contador++;
            }
        }else{
            bucle1:
            for(int i = 0; i<sizetexto;){
                int k = i;
                for (int j = 0; j<sizepalabra;j++){
                    if(texto.charAt(k++)!=buscar.charAt(j)){
                        i++;
                        continue bucle1;

                    }
                }
                i+=buscar.length();
                contador++;
            }
         }
        JOptionPane.showMessageDialog(null,sms + contador + " veces.");
    }
}
