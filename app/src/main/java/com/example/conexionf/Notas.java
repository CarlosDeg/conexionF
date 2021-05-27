package com.example.conexionf;

public class Notas {


    private String name;
    private String materia;
    private String calificacion;


    public Notas() {
    }

    public Notas(String name, String materia, String calificacion) {

        this.name = name;
        this.materia = materia;
        this.calificacion = calificacion;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }



}
