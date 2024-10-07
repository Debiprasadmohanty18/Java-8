package tanmay.MultipleInheritanceWithDefaultmethod;

public interface DefaultMethod1 {
	default int number(int n)
	{
		System.out.println("DefaultMethod1 Called...");
		return n;
	}
}
