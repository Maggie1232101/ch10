public class Fraction{
	//instance variables (attributes, fields)
	private int numerator, denominator;
	//constructor 
	public Fraction () { //default constructor
		numerator = 1;
		denominator = 1;
	}
	
	public Fraction(int n, int d){ //perameterized constructor
		numerator = n;
		if(d!= 0){
			denominator = d;
		}
		else{
			denominator = 1;
			System.out.println("Error: Denominator cannot be zero");
		}
		
	}
	//behaviour methods


}
