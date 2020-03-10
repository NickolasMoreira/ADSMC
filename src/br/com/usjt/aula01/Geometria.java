package br.com.usjt.aula01;

import java.util.ArrayList;


public class Geometria {
	public static void main(String[] args) {
	
	ArrayList<Figura> figuras = new ArrayList<Figura>();
	

	Figura retangulo = new Retangulo(10, 10);
	Figura quadrado = new Quadrado(2);
	Figura triangulo = new Triangulo(2, 4, 1, 1, 1);
	Figura losango = new Losango(2,3);
	Figura trapezio = new Trapezio(3, 2, 2, 1, 1, 1, 1);
	Figura cubo = new Cubo(2);
	Figura esfera = new Esfera(2);
	Figura cilindro = new Cilindro(2,4);
	Figura piramide = new Piramide(2,4);
	
	
	figuras.add(retangulo);
	figuras.add(quadrado);
	figuras.add(triangulo);
	figuras.add(losango);
	figuras.add(trapezio);
	figuras.add(cubo);
	figuras.add(esfera);
	figuras.add(cilindro);
	figuras.add(piramide);
	
	for(Figura fig: figuras) {
		
		System.out.println(fig);
		
	}

}
}
