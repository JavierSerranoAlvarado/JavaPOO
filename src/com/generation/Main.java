package com.generation;

public class Main {

    public static void main(String[] args) {
	 Perro lomito = new Perro();
	 lomito.nombre = "cheems";
     lomito.edad = 1;
	 lomito.raza = "mestizo";
	 lomito.tamanio = "wrande";
	 lomito.caracteristicas();
	 lomito.domir();

	 Perro lomito2 = new Perro();
	 lomito2.nombre = "Firulais";
	 lomito2.edad = 2;
	 lomito2.raza = "pug";
	 lomito2.tamanio = "chico";
	 lomito2.caracteristicas();
	 lomito2.domir();

    }
}
