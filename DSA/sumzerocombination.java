import java.util.*;
public class Hello {
    

    public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		int n=sc.nextInt(),c=0;
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++) arr[i]=sc.nextInt();
		
	    for(int i=1;i<(1<<n);i++){
	        int sum=0;
	        for(int j=0;j<n;j++){
	            
	            if((i&(1<<j))!=0){
	            sum+=arr[j];    
	            }
	        }
	        if(sum==0){
	            c++;
	        }
	    }
	    
	    System.out.print(c);
		

	}
}