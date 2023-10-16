public class Main {

  public static void main(String args[]) {
    frete("Tatuapé");
  }

  public static void frete(String bairro) {
    System.out.println("Frete para " + bairro);

    switch (bairro) {
      case "Tatuapé":
        System.out.println("Frete: " + 20);
        break;
      case "Itaim":
        System.out.println("Frete: " + 18);
        break;
      case "Moema":
        System.out.println("Frete: " + 16);
        break;
    }
  }
}
