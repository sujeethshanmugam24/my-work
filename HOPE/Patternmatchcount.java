import java.util.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);

      String str=sc.next(),s=sc.next();

      Pattern p=Pattern.compile(s);
      Matcher m=p.matcher(str);
      int c=0;

      while(m.find()){
        c++;
      }
  //m.start for index
  //m.group() for matched string
      System.out.print(c);
  }
}