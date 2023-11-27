import java.util.Scanner;

class closestpermutation {

  static int x, closest;

  static int absDiff(int a, int b) {
    return a > b ? a - b : b - a;
  }

  static void swap(char[] s, int x, int y) {
    char temp = s[x];
    s[x] = s[y];
    s[y] = temp;
  }

  static void permute(char[] str, int left, int right) {
    if (left == right) {
      int curr = Integer.parseInt(new String(str));
      if (absDiff(x, curr) < absDiff(x, closest)) {
        closest = curr;
      }
    }

    for (int index = left; index <= right; index++) {
      swap(str, left, index);
      permute(str, left + 1, right);
      swap(str, left, index);
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String input = scanner.next();
    int len = input.length();
    char[] str = input.toCharArray();

    System.out.print("Enter a number x: ");
    x = scanner.nextInt();

    closest = Integer.parseInt(new String(str));
    permute(str, 0, len - 1);
    System.out.println(closest);

  
    scanner.close();
  }
}