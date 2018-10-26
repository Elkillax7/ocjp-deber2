/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuenta;

import javax.swing.JOptionPane;

/**
 *
 * @author Alexis
 */
public class Deber2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // CASO PARA PROBAR EL RETIRO DE DINERO 
        Cuenta cuenta1 = new Cuenta();

        double montoRetiro = Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL MONTO QUE DESEA RETIRAR"));
        
        cuenta1.retirarDinero(montoRetiro);

        JOptionPane.showMessageDialog(null, "USTED HA RETIRADO" + montoRetiro);

        JOptionPane.showMessageDialog(null, cuenta1.toString());

        // CASO PARA PROBAR EL INGRESO DE DINERO
        
        Cuenta cuenta2 = new Cuenta();

        double montoIngreso = Double.parseDouble(JOptionPane.showInputDialog("INGRESE EL MONTO QUE DESEA INGRESAR"));
        
        cuenta2.ingresarDinero(montoIngreso);

        JOptionPane.showMessageDialog(null, "USTED HA INGRESADO" + montoIngreso);

        JOptionPane.showMessageDialog(null, cuenta2.toString());
        
        
    }

}
