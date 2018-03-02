class boy{
	String name=new String();
	void Getname()
	{
		name="Masud";
		System.out.println("Name is : "+name);
	}
}
class Academic extends boy{
	int roll;
	void Getroll()
	{
		roll=1012;
		System.out.println("Roll is : "+roll);
	}
}
class performance extends boy{
	float mark;
	void Getmark()
	{
		mark=32.32f;
		System.out.println("Mark is : "+mark);
	}
}
public class Hierarchical {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Academic a=new Academic();
		a.Getroll();
		boy s=new boy();
		s.Getname();
		performance r=new performance();
		r.Getmark();
	}

}
