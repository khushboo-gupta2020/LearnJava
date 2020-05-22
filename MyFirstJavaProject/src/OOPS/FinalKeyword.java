package OOPS;

 final class baseclass
{
	final void fun()
	{
	
	}
}
//class derivedclass extends baseclass
//not possible as final class cant be  a baseclass
 //final method cant be overridden
class derivedclass
{
	void fun()
	{
		
	}
}
public class FinalKeyword {

	public static void main(String[] args) {
		int i =5;
		final int j =6;
		i=7;
		//j=9;//not possible as j is final
		
System.out.println(i + j);
	}

}
/*When any variable is declared as final means 
we cant update the value again.*/