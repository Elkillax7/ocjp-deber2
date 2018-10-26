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
public class Cuenta {

    private String titular;
    private double cantidad;

    public Cuenta() {
        boolean existeTitular = false;

        this.titular = JOptionPane.showInputDialog("INGRESE EL NOMBRE DEL TITULAR");
        existeTitular = validarSiHayTitular();

        if (existeTitular) {

            this.cantidad = Float.parseFloat(JOptionPane.showInputDialog("INGRESE CANTIDAD"));

        } else {
            JOptionPane.showMessageDialog(null, "DEBIO HABER INGRESADO UN TITULAR HAGA TODO DE NUEVO");
        }
    }

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {
        return titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public boolean validarSiHayTitular() {
        if (this.titular.isEmpty()) {
            return false;
        }

        return true;

    }

    public void ingresarDinero(double cantidadAIngresar) {

        if (cantidadAIngresar > 0) {
            this.cantidad = this.cantidad + cantidadAIngresar;
        } else {

            JOptionPane.showMessageDialog(null, "USTED ESTA INGRESANDO DINERO RECUERDE!");

        }

    }

    public void retirarDinero(double cantidadARetirar) {

        if (this.cantidad != 0) {

            setCantidad(this.cantidad - cantidadARetirar);

            if (this.cantidad < 0) {
                this.cantidad = 0;
            }

        } else {

            JOptionPane.showMessageDialog(null, "USTED NO TIENE DINERO EN SU CUENTA");

        }

    }

    @Override
    public String toString() {
        return "DATOS ACTUALES DE CUENTA\n"
                + "TITULAR : " + this.titular
                + "\nCANTIDAD: " + this.cantidad;
    }

}
