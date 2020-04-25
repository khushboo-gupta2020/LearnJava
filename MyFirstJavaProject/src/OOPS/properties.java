package OOPS;

public class properties {

	public static void main(String[] args) {
		user u1= new user();
		user u2= new user();
		u1.Name = "Khushboo";
		u1.setphone("6565656565");
		u1.Email= "Khushboo29771@gmail.com";
		u1.setSSnNo("5431wery");
		System.out.println(u1.Name + "  " +u1.getPhone() +" " + u1.Email+ " " + u1.getssnno());
		System.out.println(u2.Name + "  " +u2.getPhone() +" " + u2.Email+ " " + u2.getssnno());

	}

}
class user
{
	public String Name;
	private String phone;
	public String Email;
	private String SSnNo;
	public String getPhone()
	{
		return phone;
	}
	public void  setphone(String Phone)
	{
		phone = Phone;
	}
	public String getssnno()
	{
		return SSnNo;
	}
	public void setSSnNo(String SSNno)
	{
		SSnNo=SSNno;
	}
	
}
