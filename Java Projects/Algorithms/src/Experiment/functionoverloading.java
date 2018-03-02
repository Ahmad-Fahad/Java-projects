package Experiment;

public class functionoverloading {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape s=new circle();
		shape p=new squre();
		
		s.draw();
		p.draw();

	}

}
class shape{
	public void draw(){
		
	}
}
class circle extends shape{
public void draw(){
		System.out.println("Triangle");
	}
}
class squre extends shape{
public void draw(){
		System.out.println("squre");
	}
}