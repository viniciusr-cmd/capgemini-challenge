import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Anagrams {

  public static void main(String[] args) {
    String s;
    Scanner sc = new Scanner(System.in);
    System.out.println("Please inform your word:");
    s = sc.next();
    Map<String, Integer> hashMap = new HashMap<String, Integer>();

    for (int i = 0; i < s.length(); i++) {
      for (int j = i; j < s.length(); j++) {
        char[] c = s.substring(i, j + 1).toCharArray();
        Arrays.sort(c);
        String k = new String(c);

        if (hashMap.containsKey(k)) {
          hashMap.put(k, hashMap.get(k) + 1);
        } else {
          hashMap.put(k, 1);
        }
      }
    }

    int paresAnagrama = 0;

    for (String k : hashMap.keySet()) {
      int v = hashMap.get(k);
      paresAnagrama += (v * (v - 1)) / 2;
    }

    sc.close();

    System.out.println(paresAnagrama + " Possible Pairs");
  }
}
