package entities;

public class Local {
	
	private String estado;
	private String cidade;
	private String endereco;
	private String numero;
	
	public Local() {
		
	}
	
	
	public Local(String estado, String cidade, String endereco, String numero) {
		super();
		this.estado = estado;
		this.cidade = cidade;
		this.endereco = endereco;
		this.numero = numero;
	}

	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	@Override
	public String toString() {
		return cidade + " - " + estado + "\n" + endereco + " - " + numero;
	}
	
}
