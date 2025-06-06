public class Quadrado {
  private double lado;

  public Quadrado(double lado) {
    this.lado = lado;
  }

  public double getLado() {
    return lado;
  }

  public void setLado(double lado) {
    this.lado = lado;
  }

  public void mudarValorDoLado(double novoLado) {
    this.lado = novoLado;
    System.out.println("O lado do quadrado foi alterado para: " + lado);
  }

  public double retornarValorDoLado() {
    return lado;
  }

  public double calcularArea() {
    return lado * lado;
  }
}
