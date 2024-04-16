import java.util.Scanner;

public class choinka {
  public static void main(String[] args) {
    Scanner choinka = new Scanner(System.in);
    System.out.println("Podaj literek z jakiej ma byc choinka");
    char input_1 = choinka.next().charAt(0);

    // pobieranie chara z konsoli na temat pnia
    Scanner pien = new Scanner(System.in);
    System.out.println("Podaj literek z jakiej ma byc pień");
    char input_3 = pien.next().charAt(0);

    // pobieranie wielkosci dla choinki
    Scanner wielkosc = new Scanner(System.in);
    System.out.println("Jak wielka ma być choinka");
    int input_2 = wielkosc.nextInt();

    // pobieranie wielkosci dla pnia
    Scanner grubosc_pnia = new Scanner(System.in);
    System.out.println("Jak wielka ma być pień");
    int input_4 = grubosc_pnia.nextInt();

    // debug
    System.out.println("litera ktora podales to: " + input_1);
    System.out.println("wielkosc choinki to: " + input_2);

    for (int i = 1; i <= input_2; i++) {
      for (int j = 1; j <= input_2 - i; j++) {
        System.out.print(" ");
      }
      for (int k = 1; k <= 2 * i - 1; k++) {
        System.out.print(input_1);
      }
      System.out.println();
    }
    // ciezko wygenerowac to na srodku
    for (int i_1 = 1; i_1 <= input_4; i_1++) {
      for (int j = 0; j <= input_2 - 2; j++) {
        System.out.print(" ");
      }
      System.out.println(input_3);
    }
  }
}