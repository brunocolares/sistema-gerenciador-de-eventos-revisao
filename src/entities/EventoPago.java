package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

import entities.enums.CategoriaEvento;

public class EventoPago extends Evento {

	private double precoIngresso;
	
	public EventoPago() {
		
	}

	public EventoPago(String nome, Date data, Local local, CategoriaEvento categoriaEvento, double precoIngresso) {
		super(nome, data, local, categoriaEvento);
		this.precoIngresso = precoIngresso;
	}

	public double getPrecoIngresso() {
		return precoIngresso;
	}

	public void setPrecoIngresso(double precoIngresso) {
		this.precoIngresso = precoIngresso;
	}
	
	@Override
	public void exibirDescricao() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Evento pago:");
		System.out.printf("Categoria: %s%n", getCategoriaEvento());
		System.out.printf("%s em %s%n", getNome(), simpleDateFormat.format(getData()));
		System.out.printf("Local: %s%n", getLocal());
		System.out.printf("Valor do ingresso: %s%n", getPrecoIngresso());
	}
}
