import java.util.Scanner;

public class TesteRetangulo {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe o comprimento do local (em metros):");
    double comprimento = scanner.nextDouble();

    System.out.println("Informe a largura do local (em metros):");
    double largura = scanner.nextDouble();

    Retangulo local = new Retangulo(comprimento, largura);

    double area = local.calcularArea();
    double perimetro = local.calcularPerimetro();

    System.out.println("\nÁrea total do local: " + area + " m²");
    System.out.println("Perímetro do local: " + perimetro + " m");

    int quantidadePisos = (int) Math.ceil(area);
    int quantidadeRodapes = (int) Math.ceil(perimetro);

    System.out.println("Quantidade de pisos necessária: " + quantidadePisos);
    System.out.println("Quantidade de rodapés necessária: " + quantidadeRodapes);

    scanner.close();
  }
}
