import javax.swing.*;
public class Estacionamiento {
    public static void main(String[] args) {
        String[] tipos = {
                "Moto",
                "Auto",
                "Camión"
        };
        int tipo = JOptionPane.showOptionDialog(
                null,
                "Seleccione vehículo",
                "Estacionamiento",
                0,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                tipos,
                tipos[0]);
        int horas = Integer.parseInt(
                JOptionPane.showInputDialog("Ingrese horas"));
        double tarifa = 0;
        switch (tipo) {
            case 0:
                tarifa = 3;
                break;
            case 1:
                tarifa = 5;
                break;
            case 2:
                tarifa = 10;
                break;
        }
        double total = tarifa * horas;
        JOptionPane.showMessageDialog(null,
                "Total: S/ " + total);
    }
}