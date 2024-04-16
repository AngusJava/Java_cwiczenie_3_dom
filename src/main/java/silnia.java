import java.util.Scanner;

public class silnia {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Podaj liczbę całkowitą: ");
    int liczba = scanner.nextInt();

    int wynik = obliczSilnie(liczba);

    System.out.println("Silnia z " + liczba + " wynosi: " + wynik);
  }

  public static int obliczSilnie(int n) {
    if (n < 0) {
      System.out.print("Silnia jest zdefiniowana tylko dla liczb nieujemnych.");
      return 0;
    }
    int silnia = 1;
    for (int i = 1; i <= n; i++) {
      System.out.print(i + "* ");
      silnia *= i;
    }
    return silnia;
  }
}