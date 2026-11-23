public class FractionDriver{
	public static void main (String[] args){
		Fraction f1 = new Fraction();
		Fraction f2 = new Fraction(2,5);
		Fraction f3 = new Fraction(3,7);
		Fraction f4 = new Fraction (9,13);
		
		
		System.out.println(Fraction.mult(f3,f2));
		
		System.out.println(Fraction.add(f2,f3));
		
		System.out.println(Fraction.divide(f4,f2));
		
		System.out.println(Fraction.add(f4,f3));
		
		System.out.println(Fraction.subtract(f4,f2));
	}
	
}
