class Parent
{	
	String name = "Parent";
	public void details()
	{
	    System.out.println(name);
    }
}

public class Child extends Parent
{
	String name= "Child";
	public void details()
	{
		//super. details();
		System.out.println(name);
	}
	public static void main(String[] args)
	{
		Child obj=new Child();
		obj.details();
	}
}