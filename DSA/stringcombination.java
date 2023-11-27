import java.util.*;
class Hello {

    public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List <String> Op = new ArrayList<String>(); 
		String Str = sc.next();
		
		int Len = Str.length();
		
		for(int Ctr = 1; Ctr < Math.pow(2, Len); Ctr++)
		{
		    String Temp = "";
		    for(int Shift = Len - 1; Shift > -1; Shift --)
		    {
		        if(((Ctr) & (1 << Shift)) > 0)
		            Temp += Str.charAt(Len - Shift - 1);
		    }
		    Op.add(Temp);
		}
        Collections.sort(Op);
        sc.close();
        
        for(String i : Op) System.out.println(i);
	}
}