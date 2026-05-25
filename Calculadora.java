import javax.swing.*;
public class Calculadora {
    public static void main(String[] args) {
        String[] operaciones = {
                "Sumar",
                "Restar",
                "Multiplicar",
                "Dividir",
                "Potencia"
        };
        int op = JOptionPane.showOptionDialog(
                null,
                "Seleccione operación",
                "Calculadora",
                0,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                operaciones,
                operaciones[0]);
        double a = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese primer número"));
        double b = Double.parseDouble(
                JOptionPane.showInputDialog("Ingrese segundo número"));
        switch (op) {
            case 0:
                JOptionPane.showMessageDialog(null,
                        "Resultado: " + (a + b));
                break;
            case 1:
                JOptionPane.showMessageDialog(null,
                        "Resultado: " + (a - b));
                break;
            case 2:
                JOptionPane.showMessageDialog(null,
                        "Resultado: " + (a * b));
                break;
            case 3:
                if (b == 0) {
                    JOptionPane.showMessageDialog(null,
                            "No se puede dividir entre cero");
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Resultado: " + (a / b));
                }
                break;
            case 4:
                JOptionPane.showMessageDialog(null,
                        "Resultado: " + Math.pow(a, b));
                break;
        }
    }
}