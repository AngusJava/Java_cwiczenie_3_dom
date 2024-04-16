import java.util.Random;
import java.util.Scanner;

public class choinkalosowe {
  public static void main(String[] args) {
    Random random = new Random();

    // pobieranie wielkosci dla choinki
    Scanner wielkosc = new Scanner(System.in);
    System.out.println("Jak wielka ma być choinka");
    int input_2 = wielkosc.nextInt();

    // pobieranie wielkosci dla pnia
    for (int i = 1; i <= input_2; i++) {
      // najpierw generuje odstep
      for (int j = 1; j <= input_2 - i; j++) {
        System.out.print(" ");
      }
      // generuje potem losowe znaki asci od 1 do 255
      for (int k = 1; k <= 2 * i - 1; k++) {
        int ascii = random.nextInt(255) + 1;
        char asciiChar = (char) ascii;
        System.out.print(asciiChar);

      }
      System.out.println();
    }
  }
}
