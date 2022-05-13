/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase5;

/**
 *
 * @author User
 */


public class Ejemplo3 {
    
    public boolean  esNumero (String texto){
        var retorno = true;
        var i = 0;
        var c = new char [4];
        while (i<4){
            System.out.println("Ingrese placa: ");
            c[i] = texto.charAt(i);
            if(!Character.isDigit(c[i]));
            retorno=false;
            i=i+1;
        }
        return retorno;
    }
}
