import java.util.Scanner;

public class litery {
  public static void main(String[] args) {
    // pobieranie tekstu jako string
    Scanner scanner = new Scanner(System.in);
    System.out.println("Wprowadź tekst:");
    String tekst = scanner.nextLine();

    String wynik = zamienLitery(tekst);

    System.out.println("Tekst po zamianie liter: ");
    System.out.println(wynik);
  }

  public static String zamienLitery(String tekst) {
    StringBuilder ciąg = new StringBuilder(tekst.length());
    // pętla sprawdzająca kazdy litere
    for (int i = 0; i < tekst.length(); i++) {
      char znak = tekst.charAt(i);
      // jezeli duza to zamien na mala
      if (Character.isUpperCase(znak)) {
        ciąg.append(Character.toLowerCase(znak));
        // jezeli mała to na duzą
      } else if (Character.isLowerCase(znak)) {
        ciąg.append(Character.toUpperCase(znak));
      }
    }
    return ciąg.toString();
  }
}