package application;

import java.text.ParseException;

import interfaces.GerenciadorTela;

public class Program {

	public static void main(String[] args) throws ParseException {
		GerenciadorTela gerenciador = new GerenciadorTela();
		gerenciador.exibirMenuInicial();	
		
	}
}
