package OOPS;
class stats
{
	public int count  =1;
	public static int scount  =1;
	stats()
	{
		count =1;
		scount =1;
	}
	public void increment()
	{
		count ++;
		scount ++;
	}
	public void showcount()
	{
		System.out.println("The value of count is " + count);
		System.out.println("The value of scount is " + scount);
	}
}

public class statickeyword {
	static int j = 10;
	static int n;
	static {
		System.out.println("Static block initialized.");
		n = j * 8;
		}
	public static void main(String[] args) {
		
		stats s1 = new stats();
		stats s2 = new stats();
		s1.increment();
		s2.increment();
		s1.increment();
		s1.increment();
		s1.increment();
		s2.increment();
		s1.showcount();
		s2.showcount();
		

	}

}
