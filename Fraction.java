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
	public void reduce(Fraction a){
		int gcf = GCF(numerator,denominator);
		numerator = numerator/gcf;
		denominator = denominator/gcf;
	}
	
	public static Fraction mult(Fraction a, Fraction b){
		int n = a.numerator * b.numerator;
		int d = a.denominator * b.denominator;
		
		Fraction c = new Fraction (n,d);
		
		return c;
	}
	
	public static Fraction divide(Fraction a, Fraction b){
		int n = a.numerator * b.denominator;
		int d = a.denominator * b.numerator;
		Fraction c = new Fraction(n,d);
		return c;
		
	}
	
	public static Fraction add(){
		Fraction c = new Fraction (1,2);
		return c;
	}
	
	public static int GCF(int a, int b){
		while (a!=b){
			if(a>b){
				a-=b;
			}
			else if(b>a){
				b-=a;
			}
		}
		return a;
	}
	
}
