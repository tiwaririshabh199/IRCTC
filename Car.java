class Car
{
	
public static void main(String args[])
{
	Car c=new Car();
	c.drive();
}

public void drive()
{
System.out.println("driving");
Engine e =new Engine ();
e.get();
System.out.print(e);
}
}