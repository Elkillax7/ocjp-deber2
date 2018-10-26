/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;

public class Profesor extends Persona {

    private String materia;

    public Profesor(String materia, String nombre, int edad, char genero) {
        super(nombre, edad, genero);
        this.materia = materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    @Override
    public int getProbabilidadAsistencia() {
        return Math.random() < 0.8 ? 1 : 0;
    }

}
