package huynhthihai_7541;

import java.util.ArrayList;

public class bai1 {
  public static void main(String[] args) {

    ArrayList<Integer> n = new ArrayList<>();

    for (int i = 1; i <= 10; i++) {
      n.add(i);
    }

    System.out.println("Cac phan tu trong ArrayList:");
    for (int i = 0; i < n.size(); i++) {
      System.out.println(n.get(i)); 
    }
  }
}
