public class EstimatingPi{
	public static void main(String[] args){
		Fraction MILU = new Fraction(355,113);
		final double EPSILON = Math.abs(Math.PI - MILU.toDouble());
		int n = 3;
		int d = 1;
		Fraction guess = new Fraction(n,d);
		
		while(Math.abs(Math.PI-guess.toDouble())>=EPSILON){
			Fraction c = new Fraction(n,d);
			
			guess = c;
			
			if(Math.PI-c.toDouble()<0){
				d++;
				
			}else if (Math.PI-c.toDouble()>0){
				n++;
			}
			
		}
		System.out.println(guess);
	
	}

}
