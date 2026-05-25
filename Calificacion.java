import javax.swing.*;
public class Calificacion {
    public static void main(String[] args) {
        char letra = JOptionPane.showInputDialog(
                "Ingrese letra").toUpperCase().charAt(0);
        switch (letra) {
            case 'A':
                JOptionPane.showMessageDialog(null,
                        "Excelente");
                break;
            case 'B':
                JOptionPane.showMessageDialog(null,
                        "Bueno");
                break;
            case 'C':
                JOptionPane.showMessageDialog(null,
                        "Regular");
                break;
            case 'D':
                JOptionPane.showMessageDialog(null,
                        "Deficiente");
                break;
            case 'F':
                JOptionPane.showMessageDialog(null,
                        "Reprobado");
                break;
        }
    }
}