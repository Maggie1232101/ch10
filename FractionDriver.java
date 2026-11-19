public class FractionDriver{
	public static void main (String[] args){
		Fraction f1 = new Fraction();
		Fraction f2 = new Fraction(1,3);
		Fraction f3 = new Fraction(1,2);
		Fraction f4 = new Fraction (8,10);
		
		System.out.println(Fraction.mult(f3,f2));
		
		
		System.out.println(f1);
		System.out.println(f2.getNum() + "/" + f2.getDenom());
		System.out.println(f4);
	}
	
}
