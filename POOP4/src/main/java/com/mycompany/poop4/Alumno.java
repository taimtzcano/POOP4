/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poop4;

/**
 *
 * @author tania
 */
class Alumno {
    int edad;
    String nombre, apellido, numero_de_cuenta;

    public Alumno() {
    }

    public Alumno(int edad, String nombre, String apellido, String numero_de_cuenta) {
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numero_de_cuenta = numero_de_cuenta;
    }
    public void obtenerEdad(String años){
        System.out.println("Tengo "+años+"años");
    }
    public void obtenerNombre(String nombre){
        System.out.println("Mi nombre es "+nombre);
    }
    public void obtenerApellido(String apellidos){
        System.out.println("Mis apellidos son "+apellidos);
    }

    @Override
    public String toString() {
        return "Alumno{" + "edad=" + edad + ", nombre=" + nombre + ", apellido=" + apellido + ", numero_de_cuenta=" + numero_de_cuenta + '}';
    } 
}
