import javax.swing.*;
public class ControlAcceso {
    public static void main(String[] args) {
        String[] roles = {
                "ADMIN",
                "USER",
                "GUEST"
        };
        int rol = JOptionPane.showOptionDialog(
                null,
                "Seleccione rol",
                "Acceso",
                0,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                roles,
                roles[0]);
        switch (rol) {
            case 0:
                JOptionPane.showMessageDialog(null,
                        "Acceso total");
                break;
            case 1:
                JOptionPane.showMessageDialog(null,
                        "Acceso parcial");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,
                        "Solo lectura");
                break;
        }
    }
}