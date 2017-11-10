import java.lang.*;
class Outer{
		int x=5;
		class Innersone{
			void square(){
				System.out.println("Result is :-"+(x*x));
				}
			}
		void print(){
			Innersone is=new Innersone();
			is.square();
			}
		}
class Inners{
	public static void main(String[]args){
		Outer in=new Outer();
		in.print();
		}
}			
