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
public class Estudiante extends Persona {

    private int nota;

    public Estudiante() {
        super();
        this.nota = genNAleatoria();
    }

    public Estudiante(int calificacion, String nombre, int edad, char genero) {
        super(nombre, edad, genero);
        this.nota = nota;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    private int genNAleatoria() {
        return (int) (Math.random() * 7) + 3;
    }

    @Override
    public int getProbabilidadAsistencia() {
        return Math.random() > 0.5 ? 1 : 0;
    }

}
