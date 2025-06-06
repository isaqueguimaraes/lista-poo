public class Bola {
  private String cor;
  private double circunferencia;
  private String material;

  public Bola(String cor, double circunferencia, String material) {
    this.cor = cor;
    this.circunferencia = circunferencia;
    this.material = material;
  }

  public String getCor() {
    return cor;
  }

  public void setCor(String cor) {
    this.cor = cor;
  }

  public double getCircunferencia() {
    return circunferencia;
  }

  public void setCircunferencia(double circunferencia) {
    this.circunferencia = circunferencia;
  }

  public String getMaterial() {
    return material;
  }

  public void setMaterial(String material) {
    this.material = material;
  }

  public void trocarCor(String novaCor) {
    this.cor = novaCor;
    System.out.println("A cor da bola foi trocada para: " + cor);
  }

  public void mostrarCor() {
    System.out.println("A cor atual da bola é: " + cor);
  }
}