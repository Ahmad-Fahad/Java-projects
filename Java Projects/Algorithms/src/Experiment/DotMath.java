package Experiment;

import BuildedIn.ShortPath;

public class DotMath extends ShortPath{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		p(Math.sin(90));
		p(Math.cos(90));
		p(Math.tan(90));
		p(Math.toDegrees(12));
		p(Math.toRadians(23));
		p("natural log : "+Math.log(2));
		p("Expotet "+Math.getExponent(34));
		p("Cube root"+Math.cbrt(64));
		p("10 base log :"+Math.log10(23));
		p("Thne valun eof rint"+Math.rint(23.2133));
		p("Squnre root :"+Math.sqrt(36));
	}

}
