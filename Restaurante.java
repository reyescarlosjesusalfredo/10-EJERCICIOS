import javax.swing.*;
public class Restaurante {
    public static void main(String[] args) {
        String[] menu = {
                "Desayuno",
                "Almuerzo",
                "Cena"
        };
        int op = JOptionPane.showOptionDialog(
                null,
                "Seleccione menú",
                "Restaurante",
                0,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                menu,
                menu[0]);
        String[] sub = {
                "Platos",
                "Precios"
        };
        int subop = JOptionPane.showOptionDialog(
                null,
                "Seleccione",
                "Submenú",
                0,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                sub,
                sub[0]);
        switch (op) {
            case 0:
                switch (subop) {
                    case 0:
                        JOptionPane.showMessageDialog(null,
                                "Pan con café");
                        break;
                    case 1:
                        JOptionPane.showMessageDialog(null,
                                "S/ 10");
                        break;
                }
                break;
            case 1:
                switch (subop) {

                    case 0:
                        JOptionPane.showMessageDialog(null,
                                "Arroz con pollo");
                        break;
                    case 1:
                        JOptionPane.showMessageDialog(null,
                                "S/ 18");
                        break;
                }
                break;
            case 2:
                switch (subop) {
                    case 0:
                        JOptionPane.showMessageDialog(null,
                                "Pizza");
                        break;
                    case 1:
                        JOptionPane.showMessageDialog(null,
                                "S/ 25");
                        break;
                }
                break;
        }
    }
}