public class Main {

  public static void main(String args[]) {
    pesca(3, 1);
  }

  public static void pesca(int numPessoa, int numPeixe) {
    int entradaClube = 20;
    int valorPeixe = 12;
    double valorTotal;
    double totalEntradaPessoas = entradaClube * numPessoa;

    if (numPeixe <= 1) {
      System.out.println("Total Pessoas: " + numPessoa);
      System.out.println("Quantidade peixe = " + numPeixe);
      valorTotal = totalEntradaPessoas;
      System.out.printf("Valor total: %.2f", totalEntradaPessoas);
    } else {
      System.out.println("Total Pessoas: " + numPessoa);
      System.out.println("Quantidade peixe = " + numPeixe);
      numPeixe = numPeixe - numPessoa;
      valorTotal = (totalEntradaPessoas + numPeixe * valorPeixe);
      System.out.printf("Valor total: %.2f", valorTotal);
    }
  }
}
