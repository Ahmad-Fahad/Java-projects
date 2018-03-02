interface Tutorial{
	float Tutorial=15.356F;
	float Tutorial();
}
class manus{
	int roll;
	void Getroll()
	{
		roll=101;
	}
	void Putroll()
	{
		Getroll();
		System.out.println("Roll is "+roll);
	}
	
}
class human extends manus{
	float mark1,mark2;
	float Getmark()
	{
		mark1=133.897F;
		mark2=453.78F;
		return (mark1+mark2);
	}
	void putmark()
	{
		Getmark();
		System.out.println("Mark 1 is "+mark1);
		System.out.println("Mark 2 is "+mark2);
	}
}
class being extends human implements Tutorial{
	float total;
	public float Tutorial()
	{
		System.out.println("Tutorial is "+Tutorial);
		return Tutorial;
	}
	void showall()
	{
		super.Putroll();
		super.putmark();
		total=Getmark()+Tutorial();
		System.out.println("Total mark obtained : "+total);
	}
}
public class learning {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		being b=new being();
		b.showall();
		

	}

}
