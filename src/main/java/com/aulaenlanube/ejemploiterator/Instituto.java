package com.aulaenlanube.ejemploiterator;

import java.util.Iterator;

public class Instituto {
    public static void main(String[] args) {
        Grupo dam = new Grupo("1DAM");
        
        dam.agregarAlumno(new Alumno("Edwin", "123", 45));
        dam.agregarAlumno(new Alumno("Jenny", "22222", 35));
        dam.agregarAlumno(new Alumno("Emma", null, 5));
        dam.agregarAlumno(new Alumno("Pedro", "44444", 18));
        dam.agregarAlumno(new Alumno("Julian", "5555", 15));
        dam.agregarAlumno(new Alumno("Daniel", "66666", 68));
        dam.agregarAlumno(new Alumno("Maria", "77777", 55));
        
        Iterator<Alumno> iteratorGrupo = dam.iterator();
        while (iteratorGrupo.hasNext()) {
            System.out.println(iteratorGrupo.next());
        }
        
    }
}
