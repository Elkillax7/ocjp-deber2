/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libro;

import javax.swing.JOptionPane;

/**
 *
 * @author Alexis
 */
public class MainLibro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Libro libro1 = new Libro(323215, "VIAJE AL CENTRO DE LA TIERRA", "JULIO VERNE", 254);
        String string1 = libro1.toString();

        Libro libro2 = new Libro(1321388, "HARRY POTTER", "JK ROWLING", 500);
        String string2 = libro2.toString();

        JOptionPane.showMessageDialog(null, string1 + "\n" + string2);

        libro1.compararLibro(libro2);

    }

}
