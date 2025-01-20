package huynhthihai_7541;

import java.util.ArrayList;
import java.util.Random;

public class bai5 {
  public static void main(String[] args) {
    ArrayList<Integer> number = new ArrayList<>();

    Random random = new Random();

    for (int i = 0; i < 10; i++) {
      number.add(random.nextInt(100) + 1);
    }

    System.out.println("Danh sach ban dau: " + number);

    number.remove(3);

    System.out.println("Danh sach sau khi xoa phan tu tai chi so 3: " + number);

  }
}
