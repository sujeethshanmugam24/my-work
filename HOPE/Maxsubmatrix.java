import java.util.*;

class Maxsubmatrix {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int max = 0;
    System.out.println("enter no of rows:");
    int m = sc.nextInt();
    System.out.println("enter no of columns:");
    int n = sc.nextInt();
     System.out.println("enter elements:");
    int[][] a = new int[m][n];
    
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        a[i][j] = sc.nextInt();
        if (i == 0 || j == 0 || a[i][j]==0) {
          continue;
        } else {
          a[i][j] = Math.min(Math.min(a[i - 1][j], a[i][j - 1]), a[i - 1][j - 1]) + 1;
         
        }
        if (a[i][j] > max) {
          max = a[i][j];
        }
      }
    }
  System.out.println(max);
  }
}