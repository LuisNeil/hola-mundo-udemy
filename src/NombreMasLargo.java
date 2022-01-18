import javax.swing.*;

public class NombreMasLargo {
    public static void main(String[] args) {
        String p1 = JOptionPane.showInputDialog("Ingresa nombre y apellido de persona 1");
        String p2 = JOptionPane.showInputDialog("Ingresa nombre y apellido de persona 2");
        String p3 = JOptionPane.showInputDialog("Ingresa nombre y apellido de persona 3");

        String mayor = (p1.split(" ")[0].length() < p2.split(" ")[0].length()) ? p2 : p1;
        mayor = (p3.split(" ")[0].length() < mayor.split(" ")[0].length()) ? mayor : p3;

        System.out.println("El nombre mas largo lo tiene: " + mayor);
    }
}
