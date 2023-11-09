package org.example;

public class Mecanico extends Trabajador{
    private Integer vehiculosReparados;
    public Mecanico(String nombre) {
        super(nombre);
        this.vehiculosReparados = 0;
    }
    public void repararVehiculo(){
        this.vehiculosReparados +=1;
    }

    @Override
    public Integer calcularSueldo() {
      return (this.vehiculosReparados*500)+restoDelCalculo();
    }

    @Override
    public Integer restoDelCalculo() {
        return getMontoFijo();
    }

    public Integer getVehiculosReparados() {
        return vehiculosReparados;
    }

    public void setVehiculosReparados(Integer vehiculosReparados) {
        this.vehiculosReparados = vehiculosReparados;
    }

}
