package br.com.usjt.aula01;

import java.util.ArrayList;


public class Geometria {
	public static void main(String[] args) {
	
	ArrayList<Figura> figuras = new ArrayList<Figura>();
	

	Retangulo retangulo = new Retangulo(10, 10);
	Quadrado quadrado = new Quadrado(2);
	Triangulo triangulo = new Triangulo(2, 4, 1, 1, 1);
	Losango losango = new Losango(2,3);
	Trapezio trapezio = new Trapezio(3, 2, 2, 1, 1, 1, 1);
	
	figuras.add(retangulo);
	figuras.add(quadrado);
	figuras.add(triangulo);
	figuras.add(losango);
	figuras.add(trapezio);
	
	for(Figura fig: figuras) {
		
		System.out.println(fig);
		
	}

}
}
