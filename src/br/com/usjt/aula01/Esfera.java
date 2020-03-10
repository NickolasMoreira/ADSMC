package br.com.usjt.aula01;

import java.text.DecimalFormat;

public class Esfera extends Circulo implements iVolume {
	

	
	public Esfera(double raio) {
		
		super(raio);
		
	}
	
	
	

	@Override
	public double volume() {
		return ((4/3) * 3.14 * Math.pow(raio, 3));
		
	}

	public String toString() {
		DecimalFormat df = new DecimalFormat("##.##");		
		return "---ESFERA---"
			   +"\n Volume: " + volume()+" m�"
			   +"\n";
		
	}


}
