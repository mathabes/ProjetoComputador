package br.com.fiap.modelo;

public class Monitor {
	private int polegada;
	private String marca;
	private String hertz;
	private double preco;
	
	public void setPolegada(int polegada) {
		this.polegada = polegada;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public void setHertz(String hertz) {
		this.hertz = hertz;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getPolegada() {
		return polegada;
	}
	public String getMarca() {
		return marca;
	}
	public String getHertz() {
		return hertz;
	}
	public double getPreco() {
		return preco;
	}
}
