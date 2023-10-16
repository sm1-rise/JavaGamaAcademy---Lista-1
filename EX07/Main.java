public class Main {

  public static void main(String args[]) {
    parcelar(55);
  }

  public static void parcelar(double valorCompra) {
    int maxParcela = 7;
    double valorMinimo = 20;
    int quantParcela = 0;
    for (int i = 1; i <= maxParcela; i++) {
      double valorParcela = valorCompra / i;
      if (valorParcela >= valorMinimo) {
        System.out.printf(
          "Cliente pode parcelar: R$ %.2f em %d x de %.2f \n",
          valorCompra,
          i,
          valorParcela
        );
        quantParcela = i;
      }
    }
    System.out.println("Máximo de parcelas: " + quantParcela);
  }
}
