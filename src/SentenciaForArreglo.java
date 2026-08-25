import javax.swing.*;
public class SentenciaForArreglo {
    public static void main(String[] args) {
        String[] names = {"Izura", "lolin", "Nubia", "Gabriela", "Mateo", "Alondra", "Marylin"};
        int size = names.length;
        for (int i = 0; i < size; i++) {
            if (names[i].equalsIgnoreCase("IzUrA") ||
                    names[i].contains("Marylin") ||
                    names[i].toLowerCase().equals("LOLIN".toLowerCase())) {
                continue;
            }
            System.out.println((i + 1) + ".- " + names[i]);
        }
        String buscar = JOptionPane.showInputDialog(null, "Ingrese el nombre a buscar en el sistema");

        boolean b1 = false;
        for (int i = 0; i < size; i++) {
            if(names[i].equalsIgnoreCase(buscar)){
                b1 = true;
                break;
            }
        }

        if (b1) {
            JOptionPane.showMessageDialog(null, buscar + " fue encontrado");
        } else {
            JOptionPane.showMessageDialog(null, buscar + " no se encuentra en el sistema-");
        }
    }
}