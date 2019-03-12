import java.util.*;
class ggg { 


    /* Driver program to test above function */

    public static void main(String[] args)  

    { 
    	Scanner sc=new Scanner(System.in);
    	int i,n,j,s=0,p=0;
    	System.out.println("Enter number of elements");
    	n=sc.nextInt();
    	int a[] = new int[n];
    	System.out.println("Enter elements");
        for(i=0;i<n;i++) {
        	a[i]=sc.nextInt();
         }
        for(i=0;i<n;i++) {
        	s=s+a[i];
        	for(j=i;j<n;j++)
        		p+=a[j];
        }

        System.out.println("SUM="+(s+p)); 

    }
    
} 


