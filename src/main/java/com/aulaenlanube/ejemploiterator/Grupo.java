package com.aulaenlanube.ejemploiterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Grupo implements Iterable<Alumno> {

    private String nombre;
    private ArrayList<Alumno> alumnos;

    public Grupo(String nombre) {
        this.nombre = nombre;
        alumnos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarAlumno(Alumno newAlumno) {
        this.alumnos.add(newAlumno);
    }

    public void listarAlumnos() {
        Iterator<Alumno> iteratorGrupo = iterator();
        while (iteratorGrupo.hasNext()) {
            System.out.println(iteratorGrupo.next());
        }
    }

    @Override
    public Iterator<Alumno> iterator() {
        //return alumnos.iterator();
        return new Iterator<Alumno>() {
            private int posicion = 0;

            @Override
            public boolean hasNext() {
                // Valida si en la siguiente posicion el alunmo tiene nia
                while (posicion < alumnos.size() && alumnos.get(posicion).getNia() == null) {
                    posicion++;
                }
                return posicion < alumnos.size();  //valida si hay otro alumno despues de la posicion actual
            }

            @Override
            public Alumno next() {
                return alumnos.get(posicion++); //Devuelve el alumno de la siguiente posicion
            }
        };
    }
}
