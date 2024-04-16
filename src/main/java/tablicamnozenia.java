import java.util.Scanner;

public class tablicamnozenia {
  public static void main(String[] args) {
    Scanner rozmiar_tablica = new Scanner(System.in);
    System.out.print("(Jak wielka ma byc tabliczka mnożenia:  ");
    int r_tablica = rozmiar_tablica.nextInt();
    wyswietlTabliczkeMnozenia(r_tablica);
  }

  public static void wyswietlTabliczkeMnozenia(int rozmiar) {
    for (int i = 1; i <= rozmiar; i++) {
      for (int j = 1; j <= rozmiar; j++) {
        System.out.print(i * j + "\t");
      }
      System.out.println(" ");
    }
  }
}