/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;

/**
 *
 * @author Alexis
 */
public enum Materia {

    Matematica("Matematica"), Filosofia("Filosofia"), Fisica("Fisica");

    String nombre;

    Materia(String nombre) {
        this.nombre = nombre;
    }

}
