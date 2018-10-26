/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;

import javax.swing.JOptionPane;
import jdk.nashorn.internal.scripts.JO;

/**
 *
 * @author Alexis
 */
public class MainAula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aula aula1 = new Aula();
        
        if(aula1.comprobarIfProfesorDarClase()){
            JOptionPane.showMessageDialog(null,"PUEDE DAR CLASE\n "+ aula1.toString());
        }else{
            
            JOptionPane.showMessageDialog(null,"NO PUEDE DAR CLASE\n EN AULA "+ aula1.getId());
            
        }
    }
    
}
