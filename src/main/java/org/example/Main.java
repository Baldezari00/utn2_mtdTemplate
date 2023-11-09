package org.example;

public class Main {
    public static void main(String[] args) {

        // sueldo de los trabajadores 2000$ +...
        // para los profesores 100$ * hora
        // mecanicos 500$ por vehiculo reparado

        Profesor profesor = new Profesor("Juan");
        Mecanico mecanico = new Mecanico("Balde");
        mecanico.repararVehiculo();
        mecanico.repararVehiculo();
        mecanico.repararVehiculo();

        profesor.trabajar(4);
        profesor.trabajar(10);
        profesor.trabajar(6);
        System.out.println("sueldo mecanico: "+mecanico.calcularSueldo());
        System.out.println("sueldo profesor: "+profesor.calcularSueldo());

    }
}