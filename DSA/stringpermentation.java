import java.util.ArrayList;

class stringpermentation {
  public static void main(String[] args) {

    String s = "abc";
    ArrayList<String> res = new ArrayList<>();
    res.add(s);
    int l = 0, r = s.length() - 1;
    while (l < r) {
      ArrayList<String> newRes = new ArrayList<>();
      for (String s1 : res) {
        for (int i = l; i <= r; i++) {
          newRes.add(swap(s1, i, l));
        }
      }
      l++;
      res = newRes;
    }
    for (String element : res) {
      System.out.println(element);
    }
  }

  static String swap(String s, int l, int r) {
    char c[] = s.toCharArray();
    char temp = c[l];
    c[l] = c[r];
    c[r] = temp;
    return new String(c);
  }
}
