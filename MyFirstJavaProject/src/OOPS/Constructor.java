package OOPS;

public class Constructor {

	public static void main(String[] args) {
		student s1 = new student();
		student s2 = new student("Khuhsboo" ,"A" ,3);
        System.out.println(s1.Name + " " +s1.Section + " "+s1.Rollno);
        System.out.println(s2.Name + " " +s2.Section + " " +s2.Rollno);
	}

	
}
class student
{
    public String Name;
	public String Section;
	public int Rollno;
	student(String nm,String Se,int Ro)
	{
		Name=nm;
		Section =Se;
		Rollno= Ro;
		
	}
	student()
	{
		
	}
}
//Constructor is a special metod which ahs the same name as the class but does not return anything
//It is used to initialize the object
//If it is nt expilicity defined then will return by default values	
//when the object of clas is created,onstructor of the class is called which 
//is used to intialize the attributes of class