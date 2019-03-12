interface A{
	void show();
}
class B implements A{
	public void show() {
		System.out.println("One");
	}
}
class C implements A{
	public void show() {
		System.out.println("Two");
	}
}

public class Over {

	public static void main(String[] args) {
		A a1=new B();
		a1.show();
		A a2=new C();
		a2.show();

	}

}
