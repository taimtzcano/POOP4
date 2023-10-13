/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poop4;

/**
 *
 * @author tania
 */
class Auto {
    String marca, modelo, color, motor, combustible; 

    public Auto() {
    }

    public Auto(String marca, String modelo, String color, String motor, String combustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.motor = motor;
        this.combustible = combustible;
    }
    public void avanzar(){
        System.out.println("El auto avanza");
    }
    public void retroceder (){
        System.out.println("El auto retrocede");
    }
    public void prender(){
        System.out.println("El auto esta prendido");
    }
    public void apagado(){
        System.out.println("El auto esta apagado");
    }
    public void girar(String lado){
        System.out.println("El auto gira al lado "+lado);
    }

    @Override
    public String toString() {
        return "Auto{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", motor=" + motor + ", combustible=" + combustible + '}';
    }
}