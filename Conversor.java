import javax.swing.*;
public class Conversor {
    public static void main(String[] args) {
        String[] opciones = {
                "Metros a Km",
                "Km a Metros",
                "Celsius a Fahrenheit",
                "Fahrenheit a Celsius"
        };
        int op = JOptionPane.showOptionDialog(
                null,
                "Seleccione conversión",
                "Conversor",
                0,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opciones,
                opciones[0]);
        double valor = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese valor"));
        switch (op) {
            case 0:
                JOptionPane.showMessageDialog(null,
                        "Resultado: " + (valor / 1000));
                break;
            case 1:
                JOptionPane.showMessageDialog(null,
                        "Resultado: " + (valor * 1000));
                break;
            case 2:
                JOptionPane.showMessageDialog(null,
                        "Resultado: " + ((valor * 9 / 5) + 32));
                break;
            case 3:
                JOptionPane.showMessageDialog(null,
                        "Resultado: " + ((valor - 32) * 5 / 9));
                break;
        }
    }
}