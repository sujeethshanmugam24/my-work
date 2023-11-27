

/*https://code.letuscrack.com/2d-string-array-sub-string-search-zoho/  */


import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = "MIDASTOUCHTURNSGOLD";
        String t = "CAR";
        int n = 4;  
        int p=0;
        int s1=0,s2=0,e1=0,e2=0;
        int ind=0;
        boolean flag = false;
            if(s.contains(t))
            {   while(ind!=-1)
            {
                ind = s.indexOf(t,ind);
                int r=ind+t.length()-1;
                if(ind%n < r%n)
                {
                    s1=ind/n;
                    s2=ind%n;
                    e1=r/n;
                    e2=r%n;
                    
                    System.out.println(s1+" "+s2+" "+e1+" "+e2);
                    flag=true;
                    break;
                }
                ind+=1;
            }
            }
            else
            {
                while(ind!=-1)
                {
                ind = s.indexOf(t.charAt(0),ind);
                StringBuilder str = new StringBuilder();
                if(ind>s.length()-t.length()*n) break;
                for(int i=0;i<t.length();i++)
                {
                    p=ind + i*n;
                    str.append(s.charAt(p));
                }
                if(str.toString().equals(t))
                {
                    s1=ind/n;
                    s2=ind%n;
                    e1=p/n;
                    e2=p%n;
                    
                    System.out.println(s1+" "+s2+" "+e1+" "+e2);
                    flag=true;
                    break;
                    
                }
                else
                {
                    ind++;
                }
                }
            }
     
       if(!flag)
       {
           System.out.print("-1");
       }
    }
}