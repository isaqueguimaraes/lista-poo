public class ContaCorrente {
  private int numeroConta;
  private String nomeCorrentista;
  private double saldo;

  public ContaCorrente(int numeroConta, String nomeCorrentista) {
    this.numeroConta = numeroConta;
    this.nomeCorrentista = nomeCorrentista;
    this.saldo = 0.0;
  }

  public ContaCorrente(int numeroConta, String nomeCorrentista, double saldo) {
    this.numeroConta = numeroConta;
    this.nomeCorrentista = nomeCorrentista;
    this.saldo = saldo;
  }

  public int getNumeroConta() {
    return numeroConta;
  }

  public void setNumeroConta(int numeroConta) {
    this.numeroConta = numeroConta;
  }

  public String getNomeCorrentista() {
    return nomeCorrentista;
  }

  public void setNomeCorrentista(String nomeCorrentista) {
    this.nomeCorrentista = nomeCorrentista;
  }

  public double getSaldo() {
    return saldo;
  }

  public void alterarNome(String novoNome) {
    this.nomeCorrentista = novoNome;
    System.out.println("Nome do correntista alterado para: " + novoNome);
  }

  public void depositar(double valor) {
    if (valor > 0) {
      saldo += valor;
      System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    } else {
      System.out.println("Valor de depósito inválido.");
    }
  }

  public void sacar(double valor) {
    if (valor > 0 && valor <= saldo) {
      saldo -= valor;
      System.out.println("Saque de R$" + valor + " realizado com sucesso.");
    } else {
      System.out.println("Saque inválido. Verifique o saldo.");
    }
  }
}
