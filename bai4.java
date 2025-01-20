package huynhthihai_7541;

import java.util.ArrayList;

public class bai4 {
  public static void main(String[] args) {
    ArrayList<String> thanhPho = new ArrayList<>();

    thanhPho.add("Dang Nang");
    thanhPho.add("Quang Nam");
    thanhPho.add("Hue");
    thanhPho.add("Quang Binh");
    thanhPho.add("Ha Noi");

    boolean laLondon = false;
    for (int i = 0; i < thanhPho.size(); i++) {
      String city = thanhPho.get(i);
      if (city.equals("London")) {
        laLondon = true;
        break;
      }
    }

    if (laLondon) {
      System.out.println("Danh sach co chua thanh pho London.");
    } else {
      System.out.println("Danh sach khong chua thanh pho London.");
    }

  }
}
