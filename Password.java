import java.util.*;

public class Password {

  public static void main(String[] args) {
    String pwd;
    int cont;

    Scanner sc = new Scanner(System.in);

    System.out.println("Please inform your password:");
    pwd = sc.next();

    if (pwd.length() < 6) {
      cont = 6 - pwd.length();
      System.out.println(cont + " Special Chars is Required");
    }
  }
}
