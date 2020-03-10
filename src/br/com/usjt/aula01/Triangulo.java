package br.com.usjt.aula01;

import java.text.DecimalFormat;

public class Triangulo extends Poligono {
	
	private double mn;
	private double np;
	private double pm;


	public Triangulo(double base, double altura,double mn, double np, double pm) {
		
		super.base = base;
		super.altura = altura;
		this.mn = mn;
		this.np = np;
		this.pm = pm;
		
		
	}
	
	public double area() {
		
		return (base*altura)/2;
		
	}
	

	public double perimetro() {
		
		return 0;
		
	}
	
	
	public String toString() {
		DecimalFormat df = new DecimalFormat("##.##");		
		return "---TRIANGULO---"
			   +"\n Área: " + area()
			   +"\n Perímetro:" + df.format(perimetro())
			   +"\n";
}

	
}
