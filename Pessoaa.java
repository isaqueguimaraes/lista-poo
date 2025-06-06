public class Pessoaa {
  private String nome;
  private int idade;
  private double peso;
  private double altura;

  public Pessoaa(String nome, int idade, double peso, double altura) {
    this.nome = nome;
    this.idade = idade;
    this.peso = peso;
    this.altura = altura;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public void envelhecer() {
    idade++;
    if (idade <= 21) {
      altura += 0.5;
      System.out.println(nome + " envelheceu e cresceu 0,5 cm.");
    } else {
      System.out.println(nome + " envelheceu.");
    }
  }

  public void engordar(double quilos) {
    peso += quilos;
    System.out.println(nome + " engordou " + quilos + " kg.");
  }

  public void emagrecer(double quilos) {
    peso -= quilos;
    System.out.println(nome + " emagreceu " + quilos + " kg.");
  }

  public void crescer(double centimetros) {
    altura += centimetros;
    System.out.println(nome + " cresceu " + centimetros + " cm.");
  }
}