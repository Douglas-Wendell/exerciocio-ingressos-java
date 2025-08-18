import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    boolean continuar = true;

    while (continuar) {
      System.out.println("\n=== Menu de Ingressos ===");
      System.out.println("1 - Ingresso inteiro");
      System.out.println("2 - Meia entrada");
      System.out.println("3 - Ingresso família");
      System.out.println("0 - Sair");
      System.out.print("Escolha uma opção: ");
      int opcao = scanner.nextInt();
      scanner.nextLine(); // consome o Enter

      switch (opcao) {
        case 1 -> {
          System.out.print("Digite o nome do filme: ");
          String filme = scanner.nextLine();
          System.out.print("Digite o idioma (DUBLADO/LEGENDADO): ");
          String idiomaStr = scanner.nextLine();
          Ingresso.Idioma idioma = Ingresso.Idioma.valueOf(idiomaStr.toUpperCase());

          Ingresso ingresso = new Ingresso(40.0, filme, idioma);
          System.out.println("Filme: " + filme + "\n" + idiomaStr + "\nValor ingresso inteiro: " + ingresso.getValor());
        }
        case 2 -> {
          System.out.print("Digite o nome do filme: ");
          String filme = scanner.nextLine();
          System.out.print("Digite o idioma (DUBLADO/LEGENDADO): ");
          String idiomaStr = scanner.nextLine();
          Ingresso.Idioma idioma = Ingresso.Idioma.valueOf(idiomaStr.toUpperCase());

          MeiaEntrada meiaEntrada = new MeiaEntrada(filme, idioma);
          System.out.println("Filme: " + filme + "\n" + idiomaStr + "\nValor meia entrada: " + meiaEntrada.getValor());
        }
        case 3 -> {
          System.out.print("Digite o nome do filme: ");
          String filme = scanner.nextLine();
          System.out.print("Digite o idioma (DUBLADO/LEGENDADO): ");
          String idiomaStr = scanner.nextLine();
          Ingresso.Idioma idioma = Ingresso.Idioma.valueOf(idiomaStr.toUpperCase());

          System.out.print("Digite a quantidade: ");
          int quantidade = scanner.nextInt();
          scanner.nextLine();

          IngressoFamilia familia = new IngressoFamilia(filme, idioma, quantidade);
          System.out.println("Filme: " + filme + "\n" + idiomaStr + "\nValor ingresso família: " + familia.getValor());
        }
        case 0 -> {
          continuar = false;
          System.out.println("Saindo do sistema. Obrigado!");
        }
        default -> System.out.println("Opção inválida!");
      }
    }

    scanner.close();
  }
}
