package br.edu.veiculos;

public class Veiculos {
	protected String marca;
	protected double captanqcomb;
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getCaptanqcomb() {
		return captanqcomb;
	}
	public void setCaptanqcomb(double captanqcomb) {
		this.captanqcomb = captanqcomb;
	}
	//gets sets
	
	public void acelerar() {
		
	}
	public void frear() {
		
	}
	public void buzinar() {
		System.out.println("PI, BI!");
	}
	
}
