import java.util.*;

public class Stairs {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter an INTEGER number:");
    int n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      System.out.println(
        new String(new char[n - i]).replace("\0", " ") +
        new String(new char[i]).replace("\0", "*")
      );
    }
  }
}
