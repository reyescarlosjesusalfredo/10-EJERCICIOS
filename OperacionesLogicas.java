import javax.swing.*;
public class OperacionesLogicas {
    public static void main(String[] args) {
        String[] operadores = {
                "AND",
                "OR",
                "XOR"
        };
        int op = JOptionPane.showOptionDialog(
                null,
                "Seleccione operador",
                "Lógica",
                0,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                operadores,
                operadores[0]);
        boolean a = Boolean.parseBoolean(
                JOptionPane.showInputDialog("Ingrese true o false"));
        boolean b = Boolean.parseBoolean(
                JOptionPane.showInputDialog("Ingrese true o false"));
        switch (op) {
            case 0:
                JOptionPane.showMessageDialog(null,
                        "Resultado: " + (a && b));
                break;
            case 1:
                JOptionPane.showMessageDialog(null,
                        "Resultado: " + (a || b));
                break;
            case 2:
                JOptionPane.showMessageDialog(null,
                        "Resultado: " + (a ^ b));
                break;
        }
    }
}