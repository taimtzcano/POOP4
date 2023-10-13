/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poop4;

/**
 *
 * @author tania
 */
class Punto {
    int x, y;

    public Punto() {
    }
    //se crea constructor 

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }
    //sobrecarga dos metodos que se llaman igual, con parametros diferentes
    //sobreescritura se utiliza para ya no usar imprimir punto si se va a seguir usando
    public void imprimirPunto(){
        System.out.println("x="+x+", y="+y);
    }

    @Override //anotacion para empezar a programar 
    public String toString() {
        //metodo deprecado
        return "Punto{" + "x=" + x + ", y=" + y + '}';
    }
}

