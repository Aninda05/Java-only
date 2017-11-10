import java.lang.*;
import java.util.*;
class Demo1{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		String first,second;
		System.out.println("Enter two strings");
		first=sc.next();
		second=sc.next();
		System.out.println("Number of characters in first string is "+first.length());
		System.out.println("Enter the position of the character");
		int n=sc.nextInt();
		System.out.println("Character at 2nd position of first String is "+first.charAt(n));
		System.out.println(second.toUpperCase());
		System.out.println(first.compareTo(second));	
		System.out.println(first==second);
		System.out.println(first.equals(second));
		System.out.println(first.substring(1,3));
		
		}
	}
