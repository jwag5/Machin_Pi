//Jake Wagner
//
//This program calculates PI using Machi's Method, a derivation of 
//a Taylor Series for pi = 16*arctan(1/5) - 4*arctan(1/239). 
//
//IMPORTS:
import java.lang.Math;

public class Machin_itt_pi {

	public static void main(String[] args) {
		double pi = 0;
		
		for(int i = 0; i < 10; ++i) {
			pi += (Math.pow(-1, i) / (2*i + 1)) * ((4*(Math.pow(1.0/5.0, 2*i +1))) - (Math.pow(1.0/239.0, 2*i +1)));
		}
		pi *= 4;
		
		System.out.println("pi = " + pi);
			
	}//end main

}//end Machin_itt_pi
