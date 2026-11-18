public class Fraction{
	//instance variables (attributes, fields)
	private int numerator, denominator;
	//constructor 
	public Fraction () { //default constructor
		numerator = 1;
		denominator = 1;
	}
	
	public Fraction(int n, int d){ //parameterized constructor
		setNum(n);
		setDenom(d);
	}
	
	public Fraction(String str){//String constructor
		int a = str.indexOf("/");
		numerator = Integer.parseInt(str.substring(0,a));
		setDenom(Integer.parseInt(str.substring(a+1)));
		
	}
	
	public Fraction(Fraction f){
		numerator = f.numerator;
		denominator = f.denominator;
		
	}
	
	//behaviour methods (accessor, mutator, helper)
	//accessors
	public int getNum(){
		return numerator;
		
	}
	public int getDenom(){
		return denominator;
	}
	public String toString(){
		return numerator + "/" + denominator;
	}
	public double toDouble(){
		return (double)numerator/(double)denominator;
	}
	//mutators
	public void setNum(int n){
		numerator = n;
	}
	public void setDenom(int d){
		if(d!=0){
			denominator = d;
		}
		else{
			denominator = 1;
			System.out.println("Error: denominator cannot be zero");
		}
	}	
}
