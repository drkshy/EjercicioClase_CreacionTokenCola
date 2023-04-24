package com.pperezm;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Random;

/*
@author Pablo Arturo Pérez Mata
@email pablo.arturo.perez@gmail.com
@description Clase generadora de tokens
*/

public class Main {

    public static void main(String[] args) {

        Token token = new Token();
       // System.out.println(token.obtenerAlfabeto());
        String tokenGenerado = token.generarToken();
        System.out.println(tokenGenerado);
	// write your code here
        ArrayDeque<String> cola = new ArrayDeque<>();
        for (int i =0;i<=10;i++) {
            cola.add(token.generarToken());
        }
        System.out.println(cola);
        Iterator tokenGuardados = cola.iterator();
        System.out.println("Los valores de la lista de tokens es: ");
        while (tokenGuardados.hasNext()) {
            System.out.println(tokenGuardados.next());

        }
    }
}
