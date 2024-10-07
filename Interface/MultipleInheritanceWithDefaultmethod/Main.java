package tanmay.MultipleInheritanceWithDefaultmethod;


public class Main implements DefaultMethod1, DefaultMethod2 {
	
	
	// Here we can choose, from which parent interface we need data.
	// and according to that only we extend that method.
	@Override
	public int number(int n) {
		return DefaultMethod1.super.number(n);
	}	

	public static void main(String[] args) {
		Main ob = new Main();
		System.out.println(ob.number(18));
	}

}
