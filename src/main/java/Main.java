import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    int zadanie = 0;
    Scanner liczba_z = new Scanner(System.in);
    System.out.print("(Co chcesz zrobic:  ");
    int z = liczba_z.nextInt();
    if (z > 0 && z <= 6) {
      zadanie = z;
    } else {
      System.out.println("nie miesci sie w przedziale");
    }
    switch (zadanie) {
      case 1:
        choinka.main(args);
        break;
      case 2:
        choinkalosowe.main(args);
        break;
      case 3:
        litery.main(args);
        break;
      case 4:
        tablicamnozenia.main(args);
        break;
      case 5:
        silnia.main(args);
        break;
      case 6:
        RownanieKwadratowe.main(args);
        break;
    }
  }
}
