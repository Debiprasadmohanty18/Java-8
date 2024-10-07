package tanmay.MultipleInheritanceWithDefaultmethod;

public interface DefaultMethod2 {
	default int number(int n)
	{
		System.out.println("DefaultMethod2 Called...");
		return n;
	}
}
