package Vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDoc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector(3,2);
		System.out.println("Intial size "+v.size());
		System.out.println("Initial Capacity "+ v.capacity());
		v.addElement(new Integer(1));
		v.addElement(new Integer(6));
		v.addElement(new Integer(9));
		v.addElement(new Integer(67));
		System.out.println("current size "+v.size());
		System.out.println("current capcity "+v.capacity());
		v.addElement(new Double(0.6374));
		v.addElement(new Float(0.34));
		System.out.println("current size "+v.size());
		System.out.println("current capcity "+v.capacity());
		Enumeration e=v.elements();
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
		for(int i=0;i<10;i++){
			v.addElement(new Double(0.00));
		}
		System.out.println("current size "+v.size());
		System.out.println("current capcity "+v.capacity());
		//Enumeration eq=v.elements();
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}

		

	}

}
