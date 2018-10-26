/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;

import java.util.Random;

/**
 *
 * @author Alexis
 */
public abstract class Persona {

    private String nombre;
    private int edad;
    private char genero;
    
    
    public Persona() {
        this.nombre = genNAleatorio();
        this.edad = genEAleatorio();
        this.genero= genGAleatorio();
    }



    public Persona(String nombre, int edad, char genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public char getGenero() {
        return genero;
    }
    
    

   
    
    public String genNAleatorio() {
        String conjuntoLetras = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        String newName = "";
        Random random = new Random();
        int size = 8;
        for (int i = 0; i < size; i++) {
            char c = conjuntoLetras.charAt(random.nextInt(26));
            newName += c;
        }

        return newName;
    }
    
    private int genEAleatorio() {
        return (int) (Math.random() * 7) + 11;
    }

    private char genGAleatorio() {
        return Math.random() > 0.5 ? 'F' : 'M';
    }


    
    public abstract int getProbabilidadAsistencia();
}
