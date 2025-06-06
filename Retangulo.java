public class Retangulo {
  private double comprimento;
  private double largura;

  public Retangulo(double comprimento, double largura) {
    this.comprimento = comprimento;
    this.largura = largura;
  }

  public double getComprimento() {
    return comprimento;
  }

  public void setComprimento(double comprimento) {
    this.comprimento = comprimento;
  }

  public double getLargura() {
    return largura;
  }

  public void setLargura(double largura) {
    this.largura = largura;
  }

  public void mudarValoresDosLados(double novoComprimento, double novaLargura) {
    this.comprimento = novoComprimento;
    this.largura = novaLargura;
    System.out.println("Novos lados: " + comprimento + " x " + largura);
  }

  public double calcularArea() {
    return comprimento * largura;
  }

  public double calcularPerimetro() {
    return 2 * (comprimento + largura);
  }
}
