/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dominio.Persona;

/**
 *
 * @author snake
 */
public class TestMatreices {

    public static void main(String[] args) {
        int edades[][] = new int[3][2];
        edades[0][0] = 5;
        edades[0][1] = 7;
        edades[1][0] = 8;
        edades[1][1] = 4;
        edades[1][0] = 8;
        edades[1][1] = 4;
        for (int i = 0; i < edades.length; i++) {
            for (int j = 0; j < edades[i].length; j++) {
                System.out.println("edades " + i + " " + j + " = " + edades[i][j]);
            }
        }

        String frutas[][] = {{"naranja", "Limon"}, {"Fresas", "Zarzamoras", "mora"}};
        imprimir(frutas);
        Persona personas[][] = new Persona[3][2];
        
        personas[0][0]= new Persona("karla");
        personas[0][1]= new Persona("Juan");
        
        personas[1][0]= new Persona("Manuel");
        personas[1][1]= new Persona("Lizz");
        
        personas[2][0]= new Persona("Mauricio");
        personas[2][1]= new Persona("Yessica");
        
        imprimir(personas);

    }

    public static void imprimir(Object mastriz[][]) {
        for (int i = 0; i < mastriz.length; i++) {
            for (int j = 0; j < mastriz[i].length; j++) {
                System.out.println("mastriz " + i + " " + j + " = " + mastriz[i][j]);
            }
        }
    }

}
