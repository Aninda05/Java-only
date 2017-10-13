class Adder{  
public static int add(int a,int b){return a+b;}  
public static int add(int a,int b,int c){return a+b+c;}  
}  
class TestOverloading1{  
public static void main(String[] args){ 
	Adder a1=new Adder();
	System.out.println(a1.add(11,11));  
	System.out.println(a1.add(11,11,11));  
}}  