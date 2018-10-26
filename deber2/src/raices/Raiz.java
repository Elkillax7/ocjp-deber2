/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package raices;

import javax.swing.JOptionPane;

/**
 *
 * @author Alexis
 */
public class Raiz {

    private double a;
    private double b;
    private double c;

    public Raiz() {

        this.a = Double.parseDouble(JOptionPane.showInputDialog("INGRESE TERMINO a"));
        this.b = Double.parseDouble(JOptionPane.showInputDialog("INGRESE TERMINO b"));
        this.c = Double.parseDouble(JOptionPane.showInputDialog("INGRESE TERMINO c"));

    }

    public double getDiscriminante() {

        return (Math.pow(this.b, 2)) - 4 * this.a * this.c;

    }

    public boolean comprobarRaices() {

        return (getDiscriminante() >= 0);

    }
    
    public void obtenerRaices(){
        
        double raiz1, raiz2;
        
        raiz1= (-this.b+Math.sqrt(getDiscriminante()))/(2*this.a);
        raiz2= (-this.b-Math.sqrt(getDiscriminante()))/(2*this.a);
        
        if(comprobarRaices()){
            JOptionPane.showMessageDialog(null,"Las soluciones de su ecuacion son: "+
                    "\nx1 = "+raiz1+
                    "\nx2 = "+raiz2);
        }else{
           JOptionPane.showMessageDialog(null,"La ecuacion no tiene solueciones reales"); 
        }
    }

}
