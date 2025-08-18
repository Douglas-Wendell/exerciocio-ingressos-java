public sealed class Ingresso permits MeiaEntrada, IngressoFamilia {
  private double valor = 40.0;

  private int quantidade;

  private String filme;

  private Idioma idioma;

  public enum Idioma {
    DUBLADO,
    LEGENDADO
  }

  public Ingresso(double valor, String filme, Idioma idioma) {
    this.valor = valor;
    this.filme = filme;
    this.idioma = idioma;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

  public String getFilme() {
    return filme;
  }

  public void setFilme(String filme) {
    this.filme = filme;
  }

  public Idioma getIdioma() {
    return idioma;
  }

  public void setIdioma(Idioma idioma) {
    this.idioma = idioma;
  }

}
