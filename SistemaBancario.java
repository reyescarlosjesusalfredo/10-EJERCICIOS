import javax.swing.*;
public class SistemaBancario {
    public static void main(String[] args) {
        double saldo = 1000;
        String[] opciones = {
                "Depositar",
                "Retirar",
                "Consultar saldo",
                "Salir"
        };
        int opcion = JOptionPane.showOptionDialog(
                null,
                "Seleccione una opción",
                "Sistema Bancario",
                0,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opciones,
                opciones[0]);
        switch (opcion) {
            case 0:
                double deposito = Double.parseDouble(
                        JOptionPane.showInputDialog("Ingrese monto"));
                if (deposito > 0) {
                    saldo += deposito;
                    JOptionPane.showMessageDialog(null,
                            "Nuevo saldo: " + saldo);
                } else {
                    JOptionPane.showMessageDialog(null,
                            "Monto inválido");
                }
                break;
            case 1:
                double retiro = Double.parseDouble(
                        JOptionPane.showInputDialog("Ingrese retiro"));
                if (retiro > saldo) {
                    JOptionPane.showMessageDialog(null,
                            "Saldo insuficiente");
                } else {
                    saldo -= retiro;
                    JOptionPane.showMessageDialog(null,
                            "Nuevo saldo: " + saldo);
                }
                break;
            case 2:
                JOptionPane.showMessageDialog(null,
                        "Saldo actual: " + saldo);
                break;
            case 3:
                JOptionPane.showMessageDialog(null,
                        "Saliendo...");
                break;
        }
    }
}