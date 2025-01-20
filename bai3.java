package huynhthihai_7541;

import java.util.ArrayList;

public class bai3 {
  public static void main(String[] args) {
    ArrayList<Double> gia = new ArrayList<>();

    gia.add(27.38);
    gia.add(50.527);
    gia.add(10.000);
    gia.add(159.634);
    gia.add(25.752);

    System.out.println("Danh sach gia cac san pham:");
    for (int i = 0; i < gia.size(); i++) {
      System.out.println("Gia san pham " + (i + 1) + ": " + gia.get(i) + "vnd");
    }

  }
}
