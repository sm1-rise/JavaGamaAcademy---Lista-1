public class Main {

  public static void main(String args[]) {
    comprarGame(18);
  }

  public static void comprarGame(int idade) {
    int idadePermitida = 16;
    if (idade >= idadePermitida) System.out.println(
      "Pode comprar!"
    ); else System.out.println("Não pode comprar");
  }
}
