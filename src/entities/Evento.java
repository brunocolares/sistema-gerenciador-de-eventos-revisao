package entities;

import java.time.LocalDate;
import java.util.Date;

import entities.enums.CategoriaEvento;

public abstract class Evento {
	private String nome;
	private Date data;
	private Local local;
	private CategoriaEvento categoriaEvento;
	
	public Evento() {
		
	}

	public Evento(String nome, Date data, Local local, CategoriaEvento categoriaEvento) {
		this.nome = nome;
		this.data = data;
		this.local = local;
		this.categoriaEvento = categoriaEvento;
	}
	
	public abstract void exibirDescricao() ;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Local getLocal() {
		return local;
	}

	public void setLocal(Local local) {
		this.local = local;
	}

	public CategoriaEvento getCategoriaEvento() {
		return categoriaEvento;
	}

	public void setCategoriaEvento(CategoriaEvento categoriaEvento) {
		this.categoriaEvento = categoriaEvento;
	}
	
}
