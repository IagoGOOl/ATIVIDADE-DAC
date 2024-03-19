package model;

public class Evento {
	
	 private long id;
	 private String nome;
	 private String ano;
	 private String apresentador;
	 
	 public Evento() {
	 
	 }
	 
	 
	 public Evento(long id, String nome, String ano, String apresentador) {
		super();
		this.id = id;
		this.nome = nome;
		this.ano = ano;
		this.apresentador = apresentador;
	}




	public long getId() {
		return id;
	}




	public void setId(long id) {
		this.id = id;
	}




	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public String getAno() {
		return ano;
	}




	public void setAno(String ano) {
		this.ano = ano;
	}




	public String getApresentador() {
		return apresentador;
	}




	public void setApresentador(String apresentador) {
		this.apresentador = apresentador;
	}




	@Override
	public String toString() {
		return "Evento [id=" + id + ", nome=" + nome + ", ano=" + ano + ", apresentador=" + apresentador + "]";
	}
	 
	 
}
