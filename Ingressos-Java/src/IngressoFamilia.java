public non-sealed class IngressoFamilia extends Ingresso {

  public IngressoFamilia(String filme, Idioma idioma, int quantidade) {
    super(40.0, filme, idioma);
    setQuantidade(quantidade);
  }

  @Override
  public double getValor() {
    double total = super.getValor() * getQuantidade(); // valor total sem desconto

    if (getQuantidade() > 3) {
        total *= 0.95; // aplica 5% de desconto
    }

    return total;
  }

}
