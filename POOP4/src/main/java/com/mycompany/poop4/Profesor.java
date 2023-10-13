/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poop4;

/**
 *
 * @author tania
 */
class Profesor {
    String nombre, apellido, licenciatura;
    int edad;

    public Profesor() {
    }

    public Profesor(String nombre, String apellido, String licenciatura, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.licenciatura = licenciatura;
        this.edad = edad;
    }
    public void obtenerNombre(String nombre){
        System.out.println("El nombre del profesor es: "+nombre);
    }    
    public void obtenerApellido(String apellido){
        System.out.println("Los apellidos del profesor son: "+apellido);
    }

    @Override
    public String toString() {
        return "Profesor{" + "nombre=" + nombre + ", apellido=" + apellido + ", licenciatura=" + licenciatura + ", edad=" + edad + '}';
    } 
}
