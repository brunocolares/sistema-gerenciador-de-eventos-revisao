package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

import entities.enums.CategoriaEvento;

public class EventoGratuito extends Evento {
	
	public EventoGratuito() {
		super();
	}
	
	public EventoGratuito(String nome, Date data, Local local, CategoriaEvento categoriaEvento) {
		super(nome, data, local, categoriaEvento);
	}
	
	@Override
	public void exibirDescricao() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Evento gratuito:");
		System.out.printf("Categoria: %s%n", getCategoriaEvento());
		System.out.printf("%s em %s%n", getNome(), simpleDateFormat.format(getData()));
		System.out.printf("Local: %s%n", getLocal());
	}
}
