class fighter{
	 int roll;
	String name=new String();
	void Getdata()
	{
		roll=101;
		name="Masud";
	}
	void Display()
	{
		System.out.println("Inside the student class..........");
		System.out.println("Roll is : "+roll);
	    System.out.println("Name is : "+name);
	}
}
class battle extends fighter{
	float mark;
	void Getdata()
	{
		mark=34.35f;
		
	}
	void Display()
	{
		
		System.out.println("Inside exam class..................");
		System.out.println("marks is : "+mark);
	}
}
class fight extends fighter{
		fighter s=new fighter();
		fight e= new fight();
		void Getdata()
		{
			s.Getdata();
			e.Getdata();
			
		}
		void Display()
		{
			s.Display();
			e.Display();
		}
	}
	

public class multilevelInheritance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	battle R=new battle();
		R.Getdata();
		R.Display();

	}

}
