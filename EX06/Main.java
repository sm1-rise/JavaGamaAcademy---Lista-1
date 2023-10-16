public class Main {

  public static void main(String args[]) {
    calcularRacao(1, 0.200);
  }

  public static void calcularRacao(double kgRacao, double quantRacao) {
    double totalDias = kgRacao / quantRacao;
    double sobraRacao = kgRacao % quantRacao;
    System.out.printf("Quantidade em KG: %.3f kg \n", kgRacao);
    System.out.printf("Quantidade por dia: %.3f kg \n", quantRacao);
    System.out.printf("Total : %.3f dias \n", totalDias);
    System.out.printf("Sobra ração: %.3f kg \n", sobraRacao);
  }
}
