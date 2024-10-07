package tanmay.Interface;

// Before java 1.8, We know that in Interface, we do not have any implemented method.
// But in java 1.8, We can able to take implemented method but it must be "default".

@FunctionalInterface
public interface DefaultMethodInterface {
	public void show();
	default void typeSomething()
	{
		System.out.println("It's a Default Interface Method.");
	}
}
