import java.util.Scanner;

public class RownanieKwadratowe {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj współczynniki równania kwadratowego ax^2 + bx + c = 0:");

    System.out.print("Podaj a: ");
    double a = scanner.nextDouble();
    System.out.print("Podaj b: ");
    double b = scanner.nextDouble();
    System.out.print("Podaj c: ");
    double c = scanner.nextDouble();

    rozwiazRownanieKwadratowe(a, b, c);
  }

  public static void rozwiazRownanieKwadratowe(double a, double b, double c) {
    double delta = b * b - 4 * a * c;

    if (delta > 0) {
      double pierwiastekDelta = Math.sqrt(delta);
      double x1 = (-b + pierwiastekDelta) / (2 * a);
      double x2 = (-b - pierwiastekDelta) / (2 * a);
      System.out.println("Równanie ma dwa pierwiastki rzeczywiste:");
      System.out.println("x1 = " + x1);
      System.out.println("x2 = " + x2);
    } else if (delta == 0) {
      double x = -b / (2 * a);
      System.out.println("Delta > 0 ;Równanie ma jeden podwójny pierwiastek rzeczywisty:");
      System.out.println(" Delta = 0; x = " + x);
    } else {
      System.out.println("Równanie nie ma pierwiastków rzeczywistych. Delta < 0");
    }
  }
}