/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poop4;

/**
 *
 * @author tania
 */
public class POOP4 {
    public static void main(String[] args) {
        Punto punto= new Punto();
        punto.imprimirPunto();
        Punto punto2= new Punto(3, 5);
        punto2.imprimirPunto();
        System.out.println(punto);//imprimir referencia
        
        Perro perro= new Perro("Max", "Chihuahua", "Negro", 2);
        System.out.println(perro);
        
        Auto auto= new Auto("Mazda", "Mazda 3, 2019", "Rojo", "automatico","Gasolina/Diesel");
        auto.girar("derecho");
        System.out.println(auto.toString());
        
        Alumno alumno= new Alumno(19, "Miriam", "López", "320260366");
        System.out.println(alumno);
        
        Profesor profesor= new Profesor("Dario", "Jimenez Rosas", "Ingeniero en Computacion", 30);
        System.out.println(profesor);
        
        double a,b,c;
        a=2;
        b=2;
        TrianguloRectangulo triangulorectangulo=new TrianguloRectangulo(a, b);
        System.out.println(triangulorectangulo.toString());
        System.out.println("El area es= "+triangulorectangulo.calcularArea(5, 15));
        c = triangulorectangulo.calcularHipotenusa(5, 15);
        System.out.println("Hipotenusa= "+c);        
        System.out.println("Perimetro= "+triangulorectangulo.calcularPerimetro(a, b, c));
    }
}
