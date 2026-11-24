import java.util.Scanner;
import java.util.Random;

public class FractionQuiz{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Random random = new Random();
		System.out.println("Let the Fraction Quiz Begin. Answers should be in lowest terms. Good luck!");
		
		int correct = 0;
		String str = "";
		while(!str.equals("quit")){
			Fraction f1 = new Fraction (random.nextInt(10), random.nextInt(9)+1);
			Fraction f2 = new Fraction (random.nextInt(10), random.nextInt(9)+1);
			int operation = random.nextInt(4);
			
			Fraction ans = new Fraction();
			if(operation == 1){
				System.out.print(f1 + " + " + f2 + " = ");
				ans = Fraction.add(f1,f2);
			}
			else if(operation ==2){
				System.out.print(f1 + " - " + f2 + " = ");
				ans = Fraction.subtract(f1,f2);
			}
			else if(operation ==3){
				System.out.print(f1 + " * " + f2 + " = ");
				ans = Fraction.mult(f1,f2);
			}
			else{
				System.out.print(f1 + " / " + f2 + " = ");
				ans = Fraction.divide(f1,f2);
			}
			
			
			str = in.nextLine();
			
			if(str.equals(ans.toString())){
				System.out.println("Correct!");
			}
			else{
				System.out.println("Wrong: ans is " + ans.toString());
			} 
		}
			
	}
}
