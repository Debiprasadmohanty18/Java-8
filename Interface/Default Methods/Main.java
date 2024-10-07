package tanmay.Interface;

public class Main implements DefaultMethodInterface {

	
	@Override
	public void show() {
		System.out.println("Show Implemented.");
	}
	
	public static void main(String[] args) {
		Main ob = new Main();
		ob.typeSomething();
		ob.show();
	}

}
