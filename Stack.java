import java.lang.*;
import java.util.*;
class Input
{
	int a[],top,n;
	void initial()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Size of Integer Stack ");
		n=in.nextInt();
		a=new int[n];
	}
	void push(int b)
	{
		if(top==n-1)
			System.out.println("Stack is Full");
		else
		{
			top++;
			a[top]=b;
		}

	}
	void pop()
	{
		if(top==-1)
			System.out.println("Stack is empty");
		else
		{
			top--;
		}
	}
	void display()
	{
		if(top==-1)
			System.out.println("Stack is empty");
		else
		{
			while(top>0){
				System.out.println(a[top]);
				top--;
			}
		}
	}
}
class Stack
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);        
        Input stk = new Input();
        stk.initial();
  	    while(true){
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4.Exit");
            System.out.println("Enter choice");
            int choice = sc.nextInt();
            switch (choice)
            {
            	case 1:
            		System.out.println("Enter element...");
            		int a=sc.nextInt();
            		stk.push(a);
            		break;
            	case 2:
            		stk.pop();
            		break;
            	case 3:
            		stk.display();
            		break;
            	case 4:
            		System.exit(0);
            	default:
            		System.out.println("Invalid Sorry...!!!");
		
			}
		}
	}
}