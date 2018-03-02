class base{
	String s;
	base(String c)
	{
		s=c;
		System.out.println("Student constructor "+s);
	}
	protected void finalize()
	{
		System.out.println("Student finalize "+s);
	}
}
class exam{
	exam()
	{
		base p=new base("is alive");
		System.out.println("calling exam constructor ");
	}
	protected void finalize()
	{
		System.out.println("calling exam finalize ");
	}
}
class activity extends exam{
	activity()
	{
		System.out.println("calling activity constructor ");
	}
	protected void finalize()
	{
		System.out.println("calling activity finalize ");
	}
}
public class finalized {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new activity();
		System.out.println("after calling constructor ");
	    System.gc();
	    System.runFinalization();
	}

}
