public class Main {

  public static void main(String args[]) {
    calculadora(6, 2);
  }

  private static void calculadora(double num1, double num2) {
    double adicao = num1 + num2;
    double subtracao = num1 - num2;
    double multi = num1 * num2;
    double div = num1 / num2;

    System.out.printf("valores inseridos: " + num1 + " e " + num2 + "\n");
    System.out.printf("Adição: %.2f %n", adicao);
    System.out.printf("Subtracao: %.2f %n", subtracao);
    System.out.printf("Multiplicação: %.2f %n", multi);
    System.out.printf("Divisão: %.2f %n", div);
  }
}
