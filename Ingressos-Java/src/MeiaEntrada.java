public non-sealed class MeiaEntrada extends Ingresso {

  public MeiaEntrada(String filme, Idioma idioma) {
    super(40.0,filme, idioma);
  }

  @Override
  public double getValor() {
    return super.getValor()/2;
  }

}
