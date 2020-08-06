/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dominio.Cliente;
import dominio.Empleado;
import java.util.Date;

/**
 *
 * @author snake
 */
public class TestHeremcia {
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("juan",50000.0);
        System.out.println("empleado1 = " + empleado1);
        
        Cliente cliente1 = new Cliente(new Date(),true,"sebastian",'M',4,"Carrera 4 norte 31 b 33");
        System.out.println("cliente1 = " + cliente1);
    }
}
