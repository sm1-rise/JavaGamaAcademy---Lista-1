public class Main {

  public static void main(String args[]) {
    calculadoraVeiculo("Fiat", "Uno", 20000);
  }

  public static void calculadoraVeiculo(
    String marca,
    String modelo,
    double preco
  ) {
    double parcela;
    double entrada;
    double restante;

    System.out.printf(
      "Carro escolhido: \n %s %s \n %.2f \n",
      marca,
      modelo,
      preco
    );

    entrada = (0.3 * preco);
    restante = preco - entrada;
    parcela = restante / 12;

    System.out.printf("Entrada: %.2f \n", entrada);
    System.out.printf("parcela: %.2f \n", parcela);
  }
}
