/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;


import javax.swing.JOptionPane;
 
/**
 *
 * @author aguer
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //DATOS PARA PERSONA 1    
        String nombreAux;
        int edadAux;
        char generoAux;
        float pesoAux;
        float alturaAux;

        nombreAux = JOptionPane.showInputDialog("INGRESE SU NOMBRE POR FAVOR");
        edadAux = Integer.parseInt(JOptionPane.showInputDialog("INGRESE SU EDAD POR FAVOR"));
        generoAux = JOptionPane.showInputDialog("INGRESE SU GENERO POR FAVOR").charAt(0);
        pesoAux = Float.parseFloat(JOptionPane.showInputDialog("INGRESE SU PESO POR FAVOR EN KG"));
        alturaAux = Float.parseFloat(JOptionPane.showInputDialog("INGRESE SU ALTURA POR FAVOR EN MT"));

        Persona persona1 = new Persona(nombreAux, edadAux, generoAux, pesoAux, alturaAux);
        JOptionPane.showMessageDialog(null, persona1.toString());
        persona1.mostrarIMC();
        persona1.mostrarSiEsMayorDeEdad();

        //DATOS PARA PERSONA 2
        String nombreAux2 = JOptionPane.showInputDialog("INGRESE SU NOMBRE POR FAVOR");
        int edadAux2 = Integer.parseInt(JOptionPane.showInputDialog("INGRESE SU EDAD POR FAVOR"));
        char generoAux2 = JOptionPane.showInputDialog("INGRESE SU GENERO POR FAVOR").charAt(0);

        Persona persona2 = new Persona(nombreAux2, edadAux2,generoAux2);
        persona2.setAltura(Float.parseFloat(JOptionPane.showInputDialog("INGRESE ALTURA")));
        persona2.setPeso(Float.parseFloat(JOptionPane.showInputDialog("INGRESE PESO")));
        JOptionPane.showMessageDialog(null, persona2.toString());
        persona2.mostrarIMC();
        persona2.mostrarSiEsMayorDeEdad();
        
        
        //DATOS PARA PERSONA3
        
        Persona persona3 = new Persona();
        persona3.setNombre(JOptionPane.showInputDialog("INGRESE SU NOMBRE POR FAVOR"));
        persona3.setEdad(Integer.parseInt(JOptionPane.showInputDialog("INGRESE SU EDAD POR FAVOR")));
        persona3.setGenero(JOptionPane.showInputDialog("INGRESE SU GENERO POR FAVOR").charAt(0));
        persona3.setPeso(Float.parseFloat(JOptionPane.showInputDialog("INGRESE PESO")));
        persona3.setAltura(Float.parseFloat(JOptionPane.showInputDialog("INGRESE ALTURA")));
        
        JOptionPane.showMessageDialog(null, persona3.toString());
        persona3.mostrarIMC();
        persona3.mostrarSiEsMayorDeEdad();
        
        
    


    }

}
