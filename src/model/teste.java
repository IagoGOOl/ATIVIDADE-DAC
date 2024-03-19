package model;

public class filmes {
    private String tituloDoFilme;
    private String genero;
    private String anoLancamento;
    public filmes() {
    }
    public filmes(String tituloDoFilme, String genero, String anoLancamento) {
        this.tituloDoFilme = tituloDoFilme;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
    }
    public String getTituloDoFilme() {
        return tituloDoFilme;
    }
    public void setTituloDoFilme(String tituloDoFilme) {
        this.tituloDoFilme = tituloDoFilme;
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
        return "filmes [tituloDoFilme=" + tituloDoFilme + ", genero=" + genero + ", anoLancamento=" + anoLancamento
                + "]";
    }

    
}
