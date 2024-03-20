package model;

public class Filme {
    
	private long id;
	private String titulo;
    private String genero;
    private String anoLancamento;
    
    public Filme() {
    }
    
    public Filme(long id, String titulo, String genero, String anoLancamento) {
        this.id = id;
    	this.titulo = titulo;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
    }
    
    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getAnoLancamento() {
        return anoLancamento;
    }
    public void setAnoLancamento(String anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
    
    @Override
    public String toString() {
        return "filmes [titulo=" + titulo + ", genero=" + genero + ", anoLancamento=" + anoLancamento
                + "]";
    }

    
}
