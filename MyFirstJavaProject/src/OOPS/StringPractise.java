package OOPS;

public class StringPractise {

	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("Hello");
		StringBuffer s1= new StringBuffer("World");
		System.out.println(s.append(s1));
		System.out.println(s);
		String s2 = "Hello";
		String S3= "World";
		System.out.println(s2.concat(S3));
		System.out.println(s2);
		//String Buffer is mutable.It means  same stringBuffer Object can be modified 
		//without new memory location
		
		//String is immutable and read only.It means once the value is assigned to a  string
		//object ,
		//then it can't be modified in the same memory location.
		//If it is modified then a new memory location is allocated for the new string object.
				
		
		

	}

}
