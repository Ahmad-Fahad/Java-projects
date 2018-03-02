class student{
	private int roll;
	String name;
	void getInfo()
	{
		roll=101;
		name="Masud";
	}
	void showInfo()
	{
		System.out.println("Roll is : "+roll);
	}
}
class result extends student{
	float mark;
	void getdata()
	{
		getInfo();
		mark=34.35f;
		
	}
	void showdata()
	{
		showInfo();
		System.out.println("Name is : "+name);
		System.out.println("marks is : "+mark);
	}
}

public class inheritingprivate {
	public static void main(String args[]){
		result R=new result();
		R.getdata();
		R.showdata();		
	}

}
