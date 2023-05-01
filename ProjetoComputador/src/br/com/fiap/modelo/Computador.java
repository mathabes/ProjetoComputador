package br.com.fiap.modelo;
import br.com.fiap.modelo.Monitor;
public class Computador {
	private String marcapc;
	private double precopc;
	private Monitor monitor;
	
	public void setMarcapc (String marcapc) {
		this.marcapc = marcapc;
	}
	public void setPrecopc(double precopc) {
		this.precopc = precopc;
	}
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	public String getMarcapc() {
		return marcapc;
	}
	public double getPrecopc() {
		return precopc;
	}
	public Monitor getMonitor() {
		return monitor;
	}
}
