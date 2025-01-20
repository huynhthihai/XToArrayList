package huynhthihai_7541;

import java.util.ArrayList;

public class bai2 {
  public static void main(String[] args) {
    ArrayList<String> colors = new ArrayList<>();

    colors.add("Do");
    colors.add("Xanh");
    colors.add("Trang");
    colors.add("Den");
    colors.add("Tim");

    System.out.println("Danh sach ban dau: " + colors);

    colors.set(1, "Vang");

    System.out.println("Danh sach sau khi thay doi: " + colors);

  }
}
