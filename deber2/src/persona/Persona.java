/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author aguer
 */
public final class Persona {

    private String nombre;
    private int edad;

    private char genero;
    private float peso;
    private float altura;
    private String DNI;

    //CONSTRUCTOR POR DEFECTO EXCEPTO PARA CEDULA 
    public Persona() {

        this.nombre = "";
        this.edad = 0;
        this.genero = 'M';
        this.peso = 0;
        this.altura = 0;
        this.DNI = generarDNI();
    }

    //CONSTRUCTOR CON NOMBRE, EDAD, SEXO Y CEDULA 
    public Persona(String nombre, int edad, char genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        comprobarGenero(genero);
        this.peso = 0;
        this.altura = 0;
        this.DNI = generarDNI();
    }

    //CONSTRUCTOR DONDE SE PARAMETRIZA TODOS LOS ATRIBUTOS
    public Persona(String nombre, int edad, char genero, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        comprobarGenero(genero);
        this.peso = peso;
        this.altura = altura;
        this.DNI = generarDNI();
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public char getGenero() {
        return genero;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void mostrarIMC() {

        int estadoIMC = calcularIMC();

        switch (estadoIMC) {

            case -1:
                JOptionPane.showMessageDialog(null, "USTED ESTA FLACO");
                break;

            case 0:
                JOptionPane.showMessageDialog(null, "ESTA NORMAL");
                break;

            case 1:
                JOptionPane.showMessageDialog(null, "USTED ESTA OBESO");
                break;
        }
    }

    public int calcularIMC() {

        float IMC;
        IMC = (float) (this.peso / (Math.pow(this.altura, 2)));

        return comprobarIMC(IMC);

    }

    public int comprobarIMC(float IMC) {

        if (IMC < 20) {
            return -1;
        } else if (IMC >= 20 && IMC <= 25) {
            return 0;

        } else {
            return 1;
        }

    }

    public void mostrarSiEsMayorDeEdad() {
        boolean esMayor = esMayorDeEdad();

        JOptionPane.showMessageDialog(null, (esMayor) ? "ES LEGAL" : "NO ES LEGAL");
    }

    public boolean esMayorDeEdad() {

        return (this.edad > 17);
    }

    public void comprobarGenero(char genero) {

        if (genero == 'M' || genero == 'F') {

        } else {
            this.genero = 'M';
        }

    }

    @Override
    public String toString() {
        return "DATOS DE PERSONA"
                + "\nNOMBRE: " + nombre
                + "\nEDAD  : " + edad
                + "\nGÉNERO: " + genero
                + "\nPESO  : " + peso
                + "\nALTURA: " + altura
                + "\n\nDNI  : " + DNI;

    }

    public String generarDNI() {
        int aleatorioDNI;
        char letraDNI;
        String dni;

        //GENERA UN NUMERO ALEATORTIO DE 8 CIFRAS   
        Random rand = new Random();
        aleatorioDNI = rand.nextInt(90000000) + 10000000;

        //CALCULA LA LETRA DEL DNI
        letraDNI = calcularLetraDNI(aleatorioDNI);

        //STTRING QUE CONTIENE EL DNI
        dni = Integer.toString(aleatorioDNI) + "-" + letraDNI;

        return dni;

    }

    public char calcularLetraDNI(int DNI) {
        String letras;
        int indice;

        letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        indice = DNI - (Math.abs(DNI / 23) * 23);
        return letras.charAt(indice);

    }

}
