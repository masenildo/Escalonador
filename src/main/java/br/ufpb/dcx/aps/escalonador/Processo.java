package br.ufpb.dcx.aps.escalonador;

public class Processo {
	private String nome;
	private String status;

	public Processo() {
		this.status="Fila";
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}