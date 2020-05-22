package OOPS;

 class shape1
{
	void draw()
	{
		System.out.println("Draw parent shape");
	}
	
}
 class circle1 extends shape1
 {
	 public void adition(int a ,int b)
		{
			System.out.println("c =" + a +b);
		}
	 void draw()
	 {
		 super.draw();
		 System.out.println("Draw circle shape");
	 }
 }
public class MethodOverridingSuper {

	public static void main(String[] args) {
		
		shape1   s = new circle1();
		s.draw();
		circle1 c = new circle1();
		c.adition(3, 4);c.draw();
		
	}

}
/*Why can we not override static method?
It is because the static method is bound with class whereas instance method
 is bound with an object. Static belongs to the class area, and an instance belongs to
  the heap area.*/
