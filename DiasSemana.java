import javax.swing.*;
public class DiasSemana {
    public static void main(String[] args) {
        String[] dias = {
                "1", "2", "3", "4", "5", "6", "7"
        };
        int dia = JOptionPane.showOptionDialog(
                null,
                "Seleccione día",
                "Días",
                0,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                dias,
                dias[0]) + 1;
        switch (dia) {
            case 1:
                JOptionPane.showMessageDialog(null,
                        "Lunes - Laborable");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,
                        "Martes - Laborable");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,
                        "Miércoles - Laborable");
                break;
            case 4:
                JOptionPane.showMessageDialog(null,
                        "Jueves - Laborable");
                break;
            case 5:
                JOptionPane.showMessageDialog(null,
                        "Viernes - Laborable");
                break;
            case 6:
            case 7:
                JOptionPane.showMessageDialog(null,
                        "Fin de semana");
                break;
        }
    }
}