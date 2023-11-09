package org.example;

public abstract class Trabajador {
    protected String nombre;
    protected Integer montoFijo = 2000;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        this.montoFijo = 2000;
    }

    public Trabajador(String nombre) {
        this.nombre = nombre;
    }
    public  Integer calcularSueldo(){
        return this.getMontoFijo();
    }
    public abstract Integer restoDelCalculo();

    public Integer getMontoFijo() {
        return montoFijo;
    }

    public void setMontoFijo(Integer montoFijo) {
        this.montoFijo = montoFijo;
    }
}
