import javax.swing.*;
public class Meses {
    public static void main(String[] args) {
        int mes = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese mes 1-12"));
        switch (mes) {
            case 1:
                JOptionPane.showMessageDialog(null,
                        "Enero - 31 días");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,
                        "Febrero - 28 días");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,
                        "Marzo - 31 días");
                break;
            case 4:
                JOptionPane.showMessageDialog(null,
                        "Abril - 30 días");
                break;
            case 5:
                JOptionPane.showMessageDialog(null,
                        "Mayo - 31 días");
                break;
            case 6:
                JOptionPane.showMessageDialog(null,
                        "Junio - 30 días");
                break;
            case 7:
                JOptionPane.showMessageDialog(null,
                        "Julio - 31 días");
                break;
            case 8:
                JOptionPane.showMessageDialog(null,
                        "Agosto - 31 días");
                break;
            case 9:
                JOptionPane.showMessageDialog(null,
                        "Septiembre - 30 días");
                break;
            case 10:
                JOptionPane.showMessageDialog(null,
                        "Octubre - 31 días");
                break;
            case 11:
                JOptionPane.showMessageDialog(null,
                        "Noviembre - 30 días");
                break;
            case 12:
                JOptionPane.showMessageDialog(null,
                        "Diciembre - 31 días");
                break;
        }
    }
}