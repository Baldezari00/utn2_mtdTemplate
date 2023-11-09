package org.example;

public class Profesor extends Trabajador{
    private Integer horasTrabajadas;


    public Profesor(String nombre) {
        super(nombre);
        this.horasTrabajadas = 0;
    }

    @Override
    public Integer calcularSueldo() {
        return (this.horasTrabajadas*100)+restoDelCalculo();
    }

    @Override
    public Integer restoDelCalculo() {
        return getMontoFijo();
    }

    public Integer getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(Integer horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public void trabajar (Integer horasTrabajadas){
        this.horasTrabajadas += horasTrabajadas;
    }

}
