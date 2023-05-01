package br.com.fiap.main;
import br.com.fiap.modelo.*;
public class TesteComputador {

	public static void main(String[] args) {
		Computador objComputador = new Computador();
		Monitor objMonitor = new Monitor();
		
		objComputador.setMarcapc("Positivo");
		objComputador.setPrecopc(3000);
		
		objMonitor.setPolegada(15);
		objMonitor.setMarca("Dell");
		objMonitor.setPreco(800);
		objMonitor.setHertz("60Hz");
		
		System.out.println("Marca do Computador: " + objComputador.getMarcapc() +
							"\nPreço do Computador: R$" + objComputador.getPrecopc() +
							"\nMarca do Monitor: " + objMonitor.getMarca() +
							"\nPreço do Monitor: R$" + objMonitor.getPreco() +
							"\nPolegadas: " + + objMonitor.getPolegada() +
							"\nTaxa de Quadros: " + objMonitor.getHertz());
	}
}