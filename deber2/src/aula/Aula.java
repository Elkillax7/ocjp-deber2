/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula;

import java.util.ArrayList;

/**
 *
 * @author Alexis
 */
public class Aula {

    private int id;
    private int numeroMaximoEstudiantes;
    private String materiaAsignada;
    private Profesor profesor;
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();

    public Aula() {
        this.id = genIDAleatorio();
        this.numeroMaximoEstudiantes = asignarNumMaxEstu();
        this.materiaAsignada = asignarMateria();
        this.profesor = new Profesor("Fisica", "ALEXIS GUERRERO", 40, 'M');
        llenarClase();
    }

    public int getId() {
        return id;
    }
    
    

    private int asignarNumMaxEstu() {
        return (int) (Math.random() * 15) + 20;
    }

    private String asignarMateria() {
        int indice = (int) (Math.random() * 2);
        return Materia.values()[indice].nombre;
    }

    private void llenarClase() {
        for (int i = 0; i < this.numeroMaximoEstudiantes; i++) {
            this.estudiantes.add(new Estudiante());
        }
    }

    private int genIDAleatorio() {
        return (int) (Math.random() * 9000) + 1000;
    }

    public boolean comprobarIfProfesorDarClase() {
        if (this.profesor.getProbabilidadAsistencia() == 1) {
            if (this.profesor.getMateria().equals(this.materiaAsignada)) {
                int contador = 0;
                for (Estudiante estudiante : estudiantes) {
                    if (estudiante.getProbabilidadAsistencia() == 1) {
                        contador++;
                    }
                }

                return contador > (numeroMaximoEstudiantes / 2);
            }
        }
        return false;
    }

    private int contarAprobados() {
        int numHombres = 0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getGenero() == 'M' && estudiante.getNota() > 7) {
                numHombres=numHombres+1;
            }
        }
        return numHombres;
    }

    private int contarAprobadas() {
        int numMujeres = 0;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.getGenero() == 'F' && estudiante.getNota() > 7) {
                numMujeres=numMujeres+1;
            }
        }
        return numMujeres;
    }

    @Override
    public String toString() {
        return "AULA DE ID " + this.id + " SE IMPARTE " + this.materiaAsignada
                + "\nNUMERO ESTUDIANTE: " + this.numeroMaximoEstudiantes
                + "\nPROFESOR: " + this.profesor
                + "\n APROBADOS"
                + "\nHOMBRES: " + contarAprobados()
                + "\nMUJERES: " + contarAprobadas();
    }

}
