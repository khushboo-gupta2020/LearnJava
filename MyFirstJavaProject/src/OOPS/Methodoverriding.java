package OOPS;

class shape
{
    void draw()
	{
		System.out.println("Draw a shape");
	}
}
class circle extends shape
{
	 protected  void draw()
	{
		System.out.println("Draw a circle");
    }
}
public class Methodoverriding {

	public static void main(String[] args) {
		
circle c ;
c = new circle();
c.draw();//Draw a circle
//c = new shape(); //Not possible
shape s;
s = new circle();
s.draw();
s= new shape();
s.draw();


	}

}
/* access specifier should be less restrictive than in parent method/Suppose we have 
 * proteted method in base class then we can ahve only public access specifier 
 * in child class.abstractif we have default in base class then we can have  proteted 
 * in child class or public*/
