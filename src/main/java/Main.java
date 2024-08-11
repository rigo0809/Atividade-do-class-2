import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int nada = 0;
    System.out.println("Digite X");
    int x = sc.nextInt();
    System.out.println("Digite y");
    int y = sc.nextInt();
    while (x != nada && y != nada) {
      if (x > nada && y > nada) {
        System.out.println("Localizado no Quadrante 1");
      }
      if (x > nada && y < nada) {
        System.out.println("Localizado no Quadrante 4");
      }
      if (x < nada && y > nada) {
        System.out.println("Localizado no Quadrante 2");
      }
      if (x < nada && y > nada) {
        System.out.println("Localizado no Quadrante 3");
      }

      System.out.println("Digite o numero X:");
      x = sc.nextInt();
      System.out.println("Digite o numero Y:");
      y = sc.nextInt();

    }
    sc.close();
  }

}