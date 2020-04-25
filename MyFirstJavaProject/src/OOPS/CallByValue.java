package OOPS;

public class CallByValue {

	public static void main(String[] args) {
		int a = 9;
		kuhv(a);
		System.out.println(a);

	}
	public static void kuhv(int a)
	{
		a =a+1;
	}

}
