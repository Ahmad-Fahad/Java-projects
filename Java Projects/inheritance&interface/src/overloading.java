class pupil{
	private int roll;
	private String name=new String();
	void GetData()
	{
		roll=120;
		name="Fahad";
}
	void Display()
	{
		System.out.println("Roll is : "+roll);
		System.out.println("Name is : "+name);
		
	}
}
class fruit extends pupil{
	float mark;
	void GetData()
	{
		super.GetData();
		mark=34.34f;
	}
	void Display()
	{
		super.Display();
		System.out.println("Mark is : "+mark);
	}
		

}


public class overloading {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fruit r=new fruit();
		r.GetData();
		r.Display();
	}

}
